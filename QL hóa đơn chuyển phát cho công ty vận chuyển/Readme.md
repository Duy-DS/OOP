# Đề Bài: Quản Lý Hóa Đơn Vận Chuyển ABC (Câu 3)

**Câu 3 (6,0 điểm)**

Công ty vận chuyển ABC cung cấp một số loại hình chuyển phát hàng hóa trong nội thành. Thông tin chung trên một hóa đơn chuyển phát gồm: mã vận đơn (`maVD`), tên người gửi (`tenNguoiGui`), tên người nhận (`tenNguoiNhan`), địa chỉ người nhận (`diaChiNhan`), số kilogram của hàng hóa (`soKg`).

Có 3 loại hóa đơn chuyển phát: chuyển phát thường, chuyển phát nhanh 24h và chuyển phát nhanh 2h với tiền cước mỗi loại được tính khác nhau:

### 1. Hóa đơn chuyển phát thường (`HDThuong`)
Có thêm thông tin về số lần gửi trong tháng của người gửi (`soLanGui`).
* **Công thức tính tiền cước:**
    * Nếu `soLanGui` < 3: `Tiền cước = số kilogram * 8000`
    * Ngược lại: `Tiền cước = số kilogram * 5000`

### 2. Hóa đơn chuyển phát nhanh 24h (`HD24h`)
* **Công thức tính tiền cước:**
    * `Tiền cước = 20000 + (số kilogram * 2000)`

### 3. Hóa đơn chuyển phát nhanh 2h (`HD2h`)
Có thêm thông tin về khoảng cách (`khoangCach`).
* **Công thức tính tiền cước:**
    * Nếu `khoangCach` < 2 km: `Tiền cước = 25000`
    * Ngược lại: `Tiền cước = 35000 + ((khoangCach - 2) * 5000)`

---

## Yêu Cầu Thực Hiện

### 3.1 (3 điểm) Xây dựng lớp trừu tượng `HDChuyenPhat`
Xây dựng lớp như sau:
* **Thuộc tính:** Như mô tả ở phần thông tin chung.
* **Phương thức constructor:** Constructor ngầm định và constructor đầy đủ tham số.
* Các phương thức `getter`, `setter` của lớp.
* Phương thức dạng trừu tượng để tính Tiền cước cho hóa đơn.

### 3.2 (1.5 điểm) Xây dựng các lớp con
Xây dựng 3 lớp hóa đơn chuyển phát `HDThuong`, `HD24h`, `HD2h` như mô tả ở trên, kế thừa lớp `HDChuyenPhat` và viết phương thức tính Tiền cước cho từng loại hóa đơn tương ứng.

### 3.3 (1.5 điểm) Xây dựng danh sách quản lý
Xây dựng danh sách quản lý các Hóa đơn chuyển phát (`DsHD`) như sau:
* **Thuộc tính:** Mảng các `HDChuyenPhat`, số lượng phần tử của danh sách (nếu cần).
* Viết phương thức thêm 1 phần tử cho danh sách, cho phép lựa chọn loại hóa đơn.
* Viết phương thức tính tổng Tiền cước của các hóa đơn trong danh sách.

---

### ⚠️ Lưu ý:
* Sinh viên được bổ sung các thuộc tính/phương thức khác nếu cần thiết.
* Câu **3.2** phải cài đặt đa hình.
* Câu **3.3** phải sử dụng đa hình.
* Các tên nằm trong cặp dấu `(` và `)` trong các mô tả trên là tên của lớp và thuộc tính yêu cầu sinh viên phải đặt theo chính xác.
