Đề bài
P là một thợ làm bánh rất chuyên nghiệp. P. vừa được H tặng cho một bộ N màu sắc để có thể làm nên những chiếc bánh nhiều màu. Những màu đó được thể hiện bởi một mảng A với kích thước N, với Ai thể hiện màu thứ i, là một số từ 1 đến 10^9.
Mặc dù thấy rất thích nhưng P muốn có bảng màu thật đa dạng, ko có màu nào trùng nhau. Thế nên P quyết định sẽ trộn các màu với nhau để tạo ra các màu mới như sau:
Chọn hai màu bất kỳ trong mảng. Gọi giá trị của hai màu đó là x và y. Trộn màu có giá trị x với màu có giá trị y. Sau khi trộn xong, giá trị của màu đầu tiên vẫn là x, nhưng mà giá trị của màu thứ 2 trở thành x + y.

Tìm số thao tác trộn ít nhất sao cho bảng màu của P trở nên đa dạng nhất (tất cả các giá trị màu trong mảng là  khác nhau)

Đầu vào
Dòng đầu tiên chứa T - số test case
Dòng đầu tiên của mỗi test chứa một số nguyên N là số màu
Dòng tiếp theo của mỗi test chứa mảng màu A với Ai thể hiện màu thứ i
Đầu ra
Ở mỗi test, in ra một số thể hiện số thao tác ít nhất cần thực hiện

Ràng buộc
1 <= T <= 10
1 <= N <= 10^5
1 <= Ai <= 10^9

Yêu cầu:
Mã nguồn phải có phần đọc input từ file: input.txt
Output được ghi vào file output.txt

Ví dụ:
Input:
2
3
1 2 3
3
2 1 2

Output:

0  -> mảng màu [1, 2, 3] đã bao gồm ba màu phân biệt nên ko cần trộn
1  -> lấy màu ở vị trị 2 có giá trị là 1 trộn với màu ở vị trí 1 có giá trị là 2. Chúng ta sẽ có bảng màu mới là [3, 1, 2]. Như vậy bảng màu đã trở nên đa dạng qua một lần trộn. Output ở đây là 1
 
