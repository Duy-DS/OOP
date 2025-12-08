ĐỀ BÀI: QUẢN LÝ PHIẾU MƯỢN THƯ VIỆN ABC
Câu 3 (6,0 điểm)

Thư viện trường đại học ABC cung cấp dịch vụ cho mượn tài liệu với nhiều hình thức khác nhau. Thông tin chung trên một phiếu mượn gồm: mã phiếu mượn (maPM), tên độc giả (tenDocGia), ngày mượn (ngayMuon), số điện thoại liên hệ (soDienThoai).

Có 3 loại hình phiếu mượn: Mượn sách giáo trình, Mượn tài liệu số (E-book) và Mượn thiết bị đọc (Kindle/iPad) với phí dịch vụ được tính khác nhau:

1. Phiếu mượn sách giáo trình (PMGiaoTrinh)
Có thêm thông tin về số lượng sách (soLuong) và tình trạng sách (tinhTrang - ví dụ: "Mới" hoặc "Cũ").

Công thức tính phí mượn:

Nếu soLuong < 5 cuốn: Phí mượn = soLuong * 2000

Ngược lại (từ 5 cuốn trở lên): Phí mượn = (soLuong * 2000) * 0.8 (Giảm giá 20%)

2. Phiếu mượn tài liệu số (PMTaiLieuSo)
Có thêm thông tin về dung lượng tải về tính bằng MB (dungLuongMB).

Công thức tính phí mượn:

Phí mượn = 10000 + (dungLuongMB * 200)

3. Phiếu mượn thiết bị đọc (PMThietBi)
Có thêm thông tin về loại thiết bị (loaiThietBi) và thời gian mượn tính bằng giờ (soGioMuon).

Công thức tính phí mượn:

Nếu soGioMuon <= 2 giờ: Phí mượn = 20000

Ngược lại (quá 2 giờ): Phí mượn = 20000 + ((soGioMuon - 2) * 10000)

Yêu Cầu Thực Hiện
3.1 (2.5 điểm) Xây dựng lớp trừu tượng PhieuMuon
Xây dựng lớp như sau:

Thuộc tính: Như mô tả ở phần thông tin chung. Đảm bảo tính đóng gói (encapsulation).

Phương thức constructor: Constructor không tham số (ngầm định) và constructor đầy đủ tham số.

Các phương thức getter, setter phù hợp.

Phương thức trừu tượng tinhPhiMuon() để tính phí cho phiếu mượn.

Phương thức xuatThongTin() để in thông tin cơ bản ra màn hình.

3.2 (1.5 điểm) Xây dựng các lớp con
Xây dựng 3 lớp PMGiaoTrinh, PMTaiLieuSo, PMThietBi kế thừa từ lớp PhieuMuon:

Bổ sung các thuộc tính riêng như mô tả.

Viết constructor đầy đủ tham số (sử dụng super để gọi constructor lớp cha).

Ghi đè (Override) phương thức tinhPhiMuon() theo đúng công thức nghiệp vụ.

Ghi đè phương thức xuatThongTin() để hiển thị đầy đủ thông tin riêng của từng loại.

3.3 (2.0 điểm) Xây dựng lớp quản lý và chương trình chính
Xây dựng lớp quản lý danh sách phiếu mượn (QuanLyThuVien) bao gồm:

Thuộc tính: Một danh sách (ArrayList hoặc Mảng) chứa các PhieuMuon.

Phương thức:

Thêm mới một phiếu mượn vào danh sách (Tham số truyền vào là đối tượng PhieuMuon).

Tính tổng phí dịch vụ của tất cả các phiếu mượn trong danh sách (Sử dụng đa hình).

Xuất danh sách các phiếu mượn ra màn hình.

Viết hàm main thực hiện:

Khởi tạo đối tượng quản lý.

Tạo và thêm ít nhất 3 phiếu mượn (1 PMGiaoTrinh, 1 PMTaiLieuSo, 1 PMThietBi) với dữ liệu cứng (hardcode) hoặc nhập từ bàn phím.

Gọi phương thức xuất danh sách và in tổng phí mượn ra màn hình để kiểm tra kết quả.

⚠️ Lưu ý cho sinh viên (Gợi ý ôn tập):
Tính trừu tượng: Bắt buộc lớp cha phải là abstract class và phương thức tính phí là abstract method.

Tính đa hình: Tại câu 3.3, khi duyệt danh sách để tính tổng tiền, biến chạy phải là kiểu PhieuMuon nhưng gọi hàm tinhPhiMuon() của các lớp con.

Quy tắc đặt tên: Các tên biến như maPM, tenDocGia phải đặt chính xác như đề bài.
