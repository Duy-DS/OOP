# Quản Lý Bán Vé Công Viên Đầm Sen (OOP Practice)

Đây là bài tập luyện tập Lập trình hướng đối tượng (OOP) với ngôn ngữ Java, mô phỏng hệ thống quản lý bán vé tại công viên văn hóa Đầm Sen. Dự án tập trung vào việc áp dụng các tính chất: **Kế thừa (Inheritance)** và **Đa hình (Polymorphism)**.

## 📝 Mô Tả Bài Toán

Mùa hè đến, Công viên văn hóa Đầm Sen tổ chức bán vé phục vụ khách tham quan. Hệ thống cần quản lý thông tin vé với các dữ liệu chung sau:
- Mã vé (`maVe`)
- Họ tên người chủ vé (`hoTen`)
- Năm sinh (`namSinh`)
- Số lượng trò chơi tham dự (`soTroChoi`)

Công viên phát hành **02 loại vé** với quy tắc tính giá khác nhau:

### 1. Vé Trọn Gói (`VeTronGoi`)
Khách hàng mua vé này có thể tham gia tất cả 30 trò chơi trong công viên mà không cần trả thêm phí.
> **Giá vé = 200.000 VNĐ**

### 2. Vé Từng Phần (`VeTungPhan`)
Khách hàng mua vé vào cổng và trả thêm tiền cho từng trò chơi mình tham gia.
> **Giá vé = 70.000 VNĐ (vé vào cổng) + (Số lượng trò chơi * 20.000 VNĐ)**

---

## ⚙️ Yêu Cầu Kỹ Thuật

Chương trình cần đảm bảo các yêu cầu thiết kế OOP sau:

1. **Lớp trừu tượng `Ve`**:
   - Chứa các thuộc tính chung (`maVe`, `hoTen`, `namSinh`, `soTroChoi`).
   - Các phương thức Constructor, Getter/Setter.
   - Phương thức trừu tượng `tinhGiaVe()`.

2. **Các lớp kế thừa**:
   - Xây dựng lớp `VeTronGoi` và `VeTungPhan` kế thừa từ lớp `Ve`.
   - `Override` phương thức `tinhGiaVe()` theo đúng nghiệp vụ của từng loại vé.

3. **Lớp quản lý `DanhSachVe`**:
   - Quản lý mảng các đối tượng vé.
   - Áp dụng kỹ thuật **Đa hình (Polymorphism)** để xử lý danh sách.

---

## 🚀 Chức Năng Chương Trình

Chương trình cung cấp các chức năng chính:
1. **Nhập danh sách vé:** Cho phép thêm vé mới vào danh sách (tùy chọn loại vé Trọn gói hoặc Từng phần).
2. **Tính tổng doanh thu:** Tính tổng số tiền vé công viên thu được từ tất cả các vé đã bán.
3. **Thống kê vé:** Đếm số lượng "Vé từng phần" đã bán ra.

## 🛠 Công Nghệ Sử Dụng
- Ngôn ngữ: **Java**
- IDE: **IntelliJ IDEA / Eclipse / NetBeans**
- JDK Version: **8 hoặc cao hơn**

---
*Bài tập được thiết kế nhằm mục đích ôn luyện kiến thức về Abstract Class, Inheritance và Polymorphism trong Java.*
