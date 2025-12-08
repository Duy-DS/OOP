//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DsHD danhSachHoaDon = new DsHD();

        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN CHUYỂN PHÁT");

        // Nhập thử 2-3 hóa đơn để kiểm tra
        // Bạn hãy nhập lần lượt các loại 1, 2, 3
        danhSachHoaDon.addHD();
        danhSachHoaDon.addHD();

        // Xuất danh sách để xem
        danhSachHoaDon.xuatDanhSach();

        // Tính và in tổng tiền cước
        double tong = danhSachHoaDon.tongtien();
        System.out.printf("\n>>> TỔNG TIỀN CƯỚC TOÀN BỘ: %.0f VND\n", tong);
    }
}