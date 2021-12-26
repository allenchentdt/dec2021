  import scala.io.Source;
  import java.io.File
  import java.io.PrintWriter
  import scala.collection.mutable.ListBuffer

  object Count{
    def main(args: Array[String]) {
      var output = new ListBuffer[Int]()
      val input = Source.fromFile("input.txt").getLines.toArray
      val T = input(0).toInt
      for (t <- 1 to T) {
        output += input(t * 2).split("\\D+").filter(_.nonEmpty).toList.groupBy(a => a).map(v => (v._1, v._2.length -1)).values.sum
      }
      val writer = new PrintWriter(new File("output.txt"))
      writer.write(output.mkString("\n"))
      writer.close()
    }
  }
