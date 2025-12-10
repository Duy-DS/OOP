# Bài Tập Lớn OOP: Hệ Thống Quản Lý Nhân Sự & Chấm Công

## 1. Mô Tả Bài Toán
Công ty công nghệ **SoftDev** cần xây dựng một ứng dụng console (Java) để quản lý hồ sơ nhân viên và tính lương hàng tháng. Hệ thống xoay quanh hai thực thể chính: **Phòng Ban** và **Nhân Viên**.

### A. Quản lý Phòng Ban (`PhongBan`)
Mỗi phòng ban trong công ty có các thông tin sau:
- **Mã phòng ban** (`maPB`): Số nguyên, tự động tăng (bắt đầu từ 100).
- **Tên phòng ban** (`tenPB`): Chuỗi ký tự (Ví dụ: "Phòng Kỹ Thuật", "Phòng Nhân Sự").
- **Mô tả** (`moTa`): Chuỗi ký tự.
- **Hệ số công việc** (`heSoCongViec`): Số thực (từ 1.0 đến 20.0), phản ánh độ phức tạp công việc của phòng đó.

### B. Quản lý Nhân Viên (`NhanVien`)
Mọi nhân viên đều có các thông tin chung:
- **Mã nhân viên** (`maNV`): Số nguyên, tự động tăng (bắt đầu từ 1000).
- **Họ tên** (`hoTen`): Chuỗi ký tự.
- **Ngày vào làm** (`ngayVaoLam`): Chuỗi (dd/MM/yyyy).
- **Phòng ban** (`phongBan`): Đối tượng thuộc lớp `PhongBan` (Mỗi nhân viên thuộc về 1 phòng ban).
- **Số ngày công** (`soNgayCong`): Số ngày làm việc trong tháng.

Nhân viên được chia làm 2 loại với cách tính lương khác nhau:

#### 1. Nhân viên Chính thức (`NhanVienChinhThuc`)
- **Thuộc tính riêng:** `bacLuong` (int) - Bậc lương từ 1 đến 9.
- **Công thức tính lương:**
  $$Lương = \text{Bậc lương} \times \text{Hệ số CV (của Phòng)} \times \text{Số ngày công} \times 100.000$$

#### 2. Nhân viên Thời vụ (`NhanVienThoiVu`)
- **Thuộc tính riêng:** `heSoNangSuat` (double) - Đánh giá hiệu suất làm việc.
- **Công thức tính lương:**
  $$Lương = \text{Hệ số năng suất} \times \text{Số ngày công} \times 150.000$$

---

## 2. Yêu Cầu Kỹ Thuật (OOP)

### Yêu cầu 1: Cấu trúc Class & Encapsulation
- Sử dụng **biến Static** để xử lý việc tự động tăng mã (`maPB`, `maNV`).
- Các thuộc tính phải để `private` để đảm bảo tính đóng gói, truy xuất thông qua Getter/Setter.
- Thiết lập mối quan hệ **Association (Has-A)**: Class `NhanVien` chứa một biến kiểu `PhongBan`.

### Yêu cầu 2: Kế thừa & Đa hình (Inheritance & Polymorphism)
- Xây dựng `NhanVien` là **Lớp trừu tượng (Abstract Class)**.
- Khai báo phương thức trừu tượng: `public abstract double tinhLuong();`
- Các lớp con `NhanVienChinhThuc` và `NhanVienThoiVu` kế thừa và ghi đè (Override) phương thức tính lương.

### Yêu cầu 3: Lớp Quản Lý (`QuanLyNhanSu`)
Sử dụng `ArrayList` để lưu trữ và quản lý danh sách nhân viên. Cần thực hiện các chức năng sau:
1.  **Thêm nhân viên:** Thêm một nhân viên mới (Chính thức hoặc Thời vụ) vào danh sách.
2.  **Tính tổng lương:** Tính tổng số tiền công ty phải trả cho toàn bộ nhân viên.
3.  **Tìm lương cao nhất:** Tìm và hiển thị thông tin nhân viên có lương cao nhất tháng.
4.  **Liệt kê theo phòng ban:** In danh sách toàn bộ nhân viên, được gom nhóm theo từng phòng ban (Ví dụ: Phòng IT gồm những ai, Phòng HR gồm những ai...).
5.  **Sắp xếp (Nâng cao):** Sắp xếp danh sách nhân viên theo Lương giảm dần hoặc theo Tên (Sử dụng `Comparator` hoặc `Comparable`).

---

## 3. Ví Dụ Dữ Liệu (Test Case)

**Khởi tạo Phòng Ban:**
1. Phòng Kỹ Thuật (Mã: 100, Hệ số: 15.0)
2. Phòng Hành Chính (Mã: 101, Hệ số: 10.0)

**Khởi tạo Nhân Viên:**

| Loại NV | Tên | Phòng Ban | Thông số riêng | Ngày công | Lương Dự Kiến (VNĐ) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Chính Thức** | Nguyễn Văn A | Kỹ Thuật | Bậc: 5 | 22 | 5 * 15.0 * 22 * 100k = **165.000.000** |
| **Thời Vụ** | Trần Thị B | Hành Chính | HS Năng suất: 1.5 | 20 | 1.5 * 20 * 150k = **4.500.000** |
| **Chính Thức** | Lê Văn C | Hành Chính | Bậc: 3 | 24 | 3 * 10.0 * 24 * 100k = **72.000.000** |

---

## 4. Mục Tiêu Luyện Tập
- Làm chủ **4 tính chất OOP**: Đóng gói, Kế thừa, Đa hình, Trừu tượng.
- Hiểu về từ khóa `static` và cơ chế ID tự tăng.
- Xử lý mối quan hệ giữa các đối tượng (Reference Type).
- Thao tác với Collections (`ArrayList`) và tư duy thuật toán cơ bản (tìm max, sắp xếp, gom nhóm).
