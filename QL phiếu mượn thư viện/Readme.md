# Bài Tập OOP: Quản Lý Phiếu Mượn Thư Viện ABC

## 1. Mô Tả Bài Toán

Thư viện trường đại học ABC cung cấp dịch vụ cho mượn tài liệu với nhiều hình thức khác nhau. Hệ thống cần quản lý thông tin các phiếu mượn.

**Thông tin chung trên một phiếu mượn (Lớp cha):**
* Mã phiếu mượn (`maPM`)
* Tên độc giả (`tenDocGia`)
* Ngày mượn (`ngayMuon`)
* Số điện thoại liên hệ (`soDienThoai`)

Hệ thống có **3 loại hình phiếu mượn** với cách tính phí dịch vụ khác nhau:

### Loại 1: Phiếu mượn sách giáo trình (`PMGiaoTrinh`)
* **Thông tin thêm:** Số lượng sách (`soLuong`), Tình trạng sách (`tinhTrang` - ví dụ: "Mới" hoặc "Cũ").
* **Công thức tính phí:**
    * Nếu `soLuong` < 5 cuốn: `Phí = soLuong * 2000`
    * Nếu `soLuong` >= 5 cuốn: `Phí = (soLuong * 2000) * 0.8` *(Giảm giá 20%)*

### Loại 2: Phiếu mượn tài liệu số (`PMTaiLieuSo`)
* **Thông tin thêm:** Dung lượng tải về tính bằng MB (`dungLuongMB`).
* **Công thức tính phí:**
    * `Phí = 10000 + (dungLuongMB * 200)`

### Loại 3: Phiếu mượn thiết bị đọc (`PMThietBi`)
* **Thông tin thêm:** Loại thiết bị (`loaiThietBi`), Thời gian mượn tính bằng giờ (`soGioMuon`).
* **Công thức tính phí:**
    * Nếu `soGioMuon` <= 2 giờ: `Phí = 20000`
    * Nếu `soGioMuon` > 2 giờ: `Phí = 20000 + ((soGioMuon - 2) * 10000)`

---

## 2. Yêu Cầu Kỹ Thuật (6.0 điểm)

### 2.1. Xây dựng lớp trừu tượng `PhieuMuon` (2.5 điểm)
* **Thuộc tính:** Như mô tả ở phần thông tin chung (đảm bảo tính đóng gói - Encapsulation).
* **Constructor:** Có 2 loại (ngầm định và đầy đủ tham số).
* **Phương thức:**
    * Các `getter`, `setter` phù hợp.
    * Phương thức **trừu tượng** `tinhPhiMuon()` trả về phí dịch vụ.
    * Phương thức `xuatThongTin()` in ra các thông tin chung.

### 2.2. Xây dựng các lớp con (1.5 điểm)
Xây dựng 3 lớp `PMGiaoTrinh`, `PMTaiLieuSo`, `PMThietBi` kế thừa từ `PhieuMuon`:
* Khai báo các thuộc tính riêng.
* Viết constructor đầy đủ tham số (sử dụng `super`).
* **Override** phương thức `tinhPhiMuon()` theo đúng công thức nghiệp vụ.
* **Override** phương thức `xuatThongTin()` để hiển thị thông tin chung và thông tin riêng.

### 2.3. Xây dựng chương trình quản lý (2.0 điểm)
Tạo lớp `QuanLyThuVien` (hoặc `Main`) thực hiện các công việc sau:
1.  **Quản lý danh sách:** Sử dụng mảng hoặc `ArrayList` để lưu trữ các hóa đơn thuộc nhiều loại khác nhau.
2.  **Thêm mới:** Tạo và thêm ít nhất 3 phiếu mượn (đủ 3 loại) vào danh sách (dữ liệu cứng hoặc nhập từ bàn phím).
3.  **Tính tổng:** Viết phương thức tính tổng phí dịch vụ của tất cả các phiếu mượn trong danh sách. **(Yêu cầu bắt buộc: Sử dụng Đa hình - Polymorphism)**.
4.  **Xuất danh sách:** In thông tin chi tiết của các phiếu mượn ra màn hình.

---

## 3. Ví Dụ Output Mong Muốn

```text
--- DANH SACH PHIEU MUON ---
1. PM001 - Nguyen Van A - Giao Trinh - Phi: 16000.0
   (Chi tiet: 10 cuon, tinh trang: Moi)
2. PM002 - Tran Thi B - Tai Lieu So - Phi: 15000.0
   (Chi tiet: 25 MB)
3. PM003 - Le Van C - Thiet Bi - Phi: 30000.0
   (Chi tiet: Kindle, 3 gio)

=> TONG DOANH THU THU VIEN: 61000.0 VND
