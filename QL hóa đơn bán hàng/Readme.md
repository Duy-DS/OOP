# Đề Bài: Hệ Thống Quản Lý Hóa Đơn Bán Hàng

## Yêu Cầu Thực Hiện (Câu 3 - 7 điểm)
Viết chương trình thực hiện các công việc sau:

### a. Thiết kế lớp Sản phẩm
Bao gồm:
* **Các thuộc tính:** Mã sản phẩm, tên sản phẩm, số lượng có, đơn giá.
* **Các phương thức:** Thiết lập (constructor), nhập (nhập dữ liệu đối tượng), xuất (xuất thông tin của đối tượng ra màn hình),... (sinh viên có thể viết thêm phương thức cần thiết khác).

### b. Thiết kế lớp Chi tiết hóa đơn
Bao gồm:
* **Các thuộc tính:** Mã hóa đơn, sản phẩm, số lượng bán.
* **Các phương thức:** Thiết lập, nhập, xuất, tính thành tiền (công thức: `thành tiền = số lượng bán * đơn giá của sản phẩm`),...

### c. Thiết kế lớp Chi tiết hóa đơn giảm giá
Kế thừa từ lớp **Chi tiết hóa đơn**:
* **Bổ sung thêm thuộc tính:** Tiền giảm giá.
* **Các phương thức:** Thiết lập, nhập, xuất, tính thành tiền (công thức: `thành tiền = số lượng bán * đơn giá sản phẩm - tiền giảm giá`).

### d. Cài đặt đa hình
Cài đặt đa hình cho lớp **Chi tiết hóa đơn** và lớp **Chi tiết hóa đơn giảm giá**.

### e. Thiết kế lớp Hóa đơn
Bao gồm:
* **Các thuộc tính:** Mã hóa đơn, ngày lập hóa đơn, mảng chi tiết hóa đơn (20 phần tử), số chi tiết hóa đơn (n).
* **Các phương thức:** Thiết lập, nhập, xuất, tổng thành tiền các chi tiết hóa đơn của mỗi hóa đơn,...
* **Yêu cầu hàm nhập:** Cho phép chọn:
    1. Để nhập chi tiết hóa đơn (thường).
    2. Để nhập hóa đơn chi tiết giảm giá.
* Các phương thức đều phải sử dụng đa hình.

### f. Viết hàm Main()
* Khai báo đối tượng hóa đơn `hd`.
* Thực hiện gọi nhập 1 hóa đơn có: 1 chi tiết hóa đơn thường và 1 chi tiết hóa đơn giảm giá.
* Xuất tổng thành tiền của các chi tiết hóa đơn vừa nhập.
* Xuất toàn bộ thông tin của hóa đơn ra màn hình.
