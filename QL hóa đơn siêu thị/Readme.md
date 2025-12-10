# Bài Tập Lớn OOP: Quản Lý Hóa Đơn Siêu Thị (GreenMart)

## 1. Mô Tả Bài Toán
Siêu thị điện máy **GreenMart** cần xây dựng một chương trình quản lý hóa đơn bán hàng để tính toán doanh thu cuối ngày. Hệ thống cần quản lý thông tin chung của mọi hóa đơn bao gồm:
- **Mã hóa đơn** (`maHD`): String
- **Tên khách hàng** (`tenKhachHang`): String
- **Ngày lập** (`ngayLap`): String
- **Tổng giá trị hàng hóa** (`tongGiaTri`): double

Hiện tại, siêu thị áp dụng 3 loại hình hóa đơn với quy tắc tính **Thành tiền** (số tiền khách thực trả) khác nhau:

### A. Hóa đơn bán lẻ (`HDLe`)
Khách mua lẻ thông thường tại quầy.
- **Thuộc tính riêng:** `isCuoiTuan` (boolean) - Xác định xem ngày mua có phải cuối tuần hay không.
- **Công thức tính tiền:**
    - Nếu là ngày thường: `Thành tiền = tongGiaTri`
    - Nếu là ngày cuối tuần: `Thành tiền = tongGiaTri - 10.000 VNĐ` (Giảm trực tiếp 10k).

### B. Hóa đơn bán buôn (`HDBuon`)
Khách mua sỉ với số lượng lớn.
- **Thuộc tính riêng:** `soLuongMatHang` (int).
- **Công thức tính tiền:**
    - Nếu `soLuongMatHang > 10`: `Thành tiền = tongGiaTri * 90%` (Chiết khấu 10%).
    - Ngược lại: `Thành tiền = tongGiaTri * 95%` (Chiết khấu 5%).

### C. Hóa đơn Online (`HDOnline`)
Khách đặt hàng qua mạng và cần giao hàng tận nơi.
- **Thuộc tính riêng:** `khoangCach` (double) - Khoảng cách giao hàng tính bằng km.
- **Công thức tính tiền:** `Thành tiền = tongGiaTri + Phí Ship`
    - *Quy tắc tính Phí Ship:*
        - Nếu `khoangCach < 5 km`: Phí Ship = 15.000 VNĐ.
        - Nếu `khoangCach >= 5 km`: Phí Ship = 15.000 + (khoangCach - 5) * 2.000 VNĐ.

---

## 2. Yêu Cầu Lập Trình

### Yêu cầu 1: Xây dựng lớp trừu tượng (Abstract Class)
Tạo lớp cha `HoaDon` với:
- Các thuộc tính chung (đã mô tả ở trên).
- Constructor đầy đủ tham số và mặc định.
- Các phương thức Getter/Setter.
- Phương thức trừu tượng `public abstract double tinhThanhTien();`

### Yêu cầu 2: Kế thừa và Đa hình
Xây dựng 3 lớp con `HDLe`, `HDBuon`, `HDOnline` kế thừa từ `HoaDon`:
- Khai báo các thuộc tính riêng.
- Viết Constructor (sử dụng từ khóa `super` để gọi constructor lớp cha).
- Override (ghi đè) phương thức `tinhThanhTien()` theo đúng công thức nghiệp vụ.

### Yêu cầu 3: Lớp Quản lý (Manager Class)
Xây dựng lớp `QuanLyHoaDon` để quản lý danh sách hóa đơn:
- **Thuộc tính:** Mảng `HoaDon[]` (hoặc `ArrayList<HoaDon>`).
- **Phương thức:**
    1. `themHoaDon(HoaDon hd)`: Thêm một hóa đơn mới vào danh sách.
    2. `tinhTongDoanhThu()`: Tính tổng số tiền thu được từ tất cả các hóa đơn trong danh sách.
    3. `xuatDanhSach()` (Tùy chọn): In ra thông tin các hóa đơn để kiểm tra.

---

## 3. Ví Dụ Kiểm Thử (Test Case)

| Loại Hóa Đơn | Input Dữ Liệu | Kết Quả Mong Đợi (Thành Tiền) | Giải Thích |
| :--- | :--- | :--- | :--- |
| **Bán Lẻ** | Giá trị: 100k, Cuối tuần: `true` | **90.000** | 100k - 10k |
| **Bán Buôn** | Giá trị: 1.000k, Số lượng: 5 | **950.000** | 1.000k * 95% (do <= 10 món) |
| **Bán Buôn** | Giá trị: 1.000k, Số lượng: 20 | **900.000** | 1.000k * 90% (do > 10 món) |
| **Online** | Giá trị: 200k, K/cách: 3km | **215.000** | 200k + 15k ship |
| **Online** | Giá trị: 200k, K/cách: 10km | **240.000** | 200k + 15k + (5 * 2k) ship |

## 4. Mục Tiêu Luyện Tập
- Hiểu và áp dụng **Abstract Class** (Lớp trừu tượng).
- Thực hành cơ chế **Inheritance** (Kế thừa).
- Hiểu rõ cơ chế **Polymorphism** (Đa hình) khi duyệt danh sách và tính tiền.
- Quản lý mảng đối tượng/ArrayList trong Java.
