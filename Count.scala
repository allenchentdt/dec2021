  import scala.io.Source;
  import java.io.File
  import java.io.PrintWriter
  import scala.collection.mutable.ListBuffer

  object Count{
    def main(args: Array[String]) {
      var output = new ListBuffer[Int]()
      val input = Source.fromFile("input.txt").getLines.toArray
      /*Lấy ra số testcase*/
      val T = input(0).toInt
      for (t <- 1 to T) {
        /*Lấy ra từng mảng của mỗi testcase*/
        val A = input(t * 2).split("\\D+").filter(_.nonEmpty).toList
        /*Nhóm các giá trị giống nhau lại và đếm số lượng trùng lặp*/
        val hm = A.groupBy(a => a).map(v => (v._1, v._2.length - 1))
        /*Tính tổng số lượng trùng lặp cần phải xử lý*/
        var count = hm.values.sum
        output += count
      }
      val writer = new PrintWriter(new File("output.txt"))
      writer.write(output.mkString("\n"))
      writer.close()
      Source.fromFile("output.txt").foreach { x => print(x) }
    }
  }
