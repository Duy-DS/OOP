# Bài tập lớn: Quản lý Sắp xếp Phòng học (OOP)

Dự án này là một bài tập thực hành Lập trình hướng đối tượng (OOP), mô phỏng hệ thống quản lý và sắp xếp phòng học tại trường đại học.

## 1. Mô tả bài toán

Trường đại học XYZ cần quản lý việc sắp xếp phòng học cho các lớp. Hệ thống cần quản lý thông tin về các Phòng học, Lớp học và Bảng sắp xếp phân phòng.

### 1.1. Thông tin Phòng học (`PhongHoc`)
Thông tin chung bao gồm:
- **Mã phòng (`maPhong`):** Số nguyên 5 chữ số, tự động tăng (bắt đầu từ 10000).
- **Tên phòng (`tenPhong`):** Chuỗi ký tự.
- **Số ghế (`soGhe`):** Số nguyên.

Có 3 loại phòng học với cách tính **Tiêu chuẩn phục vụ** khác nhau:

| Loại phòng | Thuộc tính riêng | Quy tắc tính Tiêu chuẩn phục vụ |
| :--- | :--- | :--- |
| **Phòng Lý thuyết** | `coMayChieu` (boolean) | Bằng `soGhe`. Nếu có máy chiếu, cộng thêm **20** điểm. |
| **Phòng Máy tính** | `soMayTinh` (int) | Bằng `soMayTinh * 2`. |
| **Phòng Hội thảo** | Không có | Bằng `soGhe`. Nếu số ghế > 200, nhân hệ số **1.5**. |

### 1.2. Thông tin Lớp học (`LopHoc`)
Thông tin bao gồm:
- **Mã lớp (`maLop`):** Số nguyên 3 chữ số, tự động tăng (bắt đầu từ 100).
- **Tên lớp (`tenLop`):** Chuỗi ký tự.
- **Sĩ số (`siSo`):** Số lượng sinh viên.

### 1.3. Bảng sắp xếp (`BangSapXep`)
Lưu trữ thông tin phân công phòng học, mỗi lượt sắp xếp gồm:
- 01 Phòng học.
- 01 Lớp học.
- Kíp học (Ví dụ: "Sáng thứ 2", "Chiều thứ 6"...).

---

## 2. Yêu cầu kỹ thuật

### 2.1. Lớp trừu tượng `PhongHoc`
- Khai báo lớp dạng **Abstract Class**.
- Xây dựng Constructor đầy đủ tham số (lưu ý xử lý mã phòng tự tăng).
- Các phương thức Getter/Setter.
- Khai báo phương thức trừu tượng `tinhTieuChuan()` để các lớp con cài đặt.

### 2.2. Các lớp kế thừa
Xây dựng 3 lớp: `PhongLyThuyet`, `PhongMayTinh`, `PhongHoiThao`.
- Kế thừa từ lớp `PhongHoc`.
- Bổ sung thuộc tính riêng.
- Cài đặt (Override) phương thức `tinhTieuChuan()` theo quy tắc nghiệp vụ đã mô tả.

### 2.3. Lớp `LopHoc`
- Xây dựng đầy đủ thuộc tính và Constructor (xử lý mã lớp tự tăng).

### 2.4. Quản lý danh sách (`BangSapXep`)
- Sử dụng `ArrayList` (hoặc cấu trúc danh sách tương đương) để lưu trữ các phân công.
- **Chức năng 1:** Phương thức thêm một lượt sắp xếp vào danh sách.
- **Chức năng 2:** Phương thức duyệt danh sách và in ra màn hình các phòng học có **Tiêu chuẩn phục vụ > 100 điểm**.
- *(Yêu cầu nâng cao)*: Kiểm tra tính hợp lệ khi thêm: `siSo` của lớp không được lớn hơn `soGhe` của phòng.

---

## 3. Kiến thức áp dụng
- **Inheritance (Kế thừa):** Tái sử dụng code giữa các loại phòng.
- **Polymorphism (Đa hình):** Xử lý phương thức `tinhTieuChuan()` khác nhau ở từng lớp con.
- **Abstract Class (Lớp trừu tượng):** Định nghĩa khung mẫu cho các đối tượng phòng.
- **Encapsulation (Đóng gói):** Sử dụng access modifiers (private/protected) và getter/setter.
- **Static members:** Xử lý ID tự tăng.

## 4. Ví dụ Output mong muốn

```text
--- Danh sách phòng có tiêu chuẩn phục vụ cao (>100) ---
Kíp: Sáng thứ 2 | Phòng: Hội trường C (300 ghế) | Lớp: K65 Kinh Tế -> Điểm: 450.0
Kíp: Chiều thứ 4 | Phòng: Lab 01 (60 máy) | Lớp: K65 CNTT -> Điểm: 120.0
