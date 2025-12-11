import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DanhSachVe ds = new DanhSachVe();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("\n--- CHƯƠNG TRÌNH QUẢN LÝ VÉ ĐẦM SEN ---");
            System.out.println("1. Nhập thêm vé mới");
            System.out.println("2. Xem tổng doanh thu");
            System.out.println("3. Đếm số vé Từng phần");
            System.out.println("0. Thoát");
            System.out.print("Bạn chọn chức năng số: ");

            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
                continue; // Quay lại đầu vòng lặp
            }

            switch (luaChon) {
                case 1:
                    System.out.println("\n[NHẬP VÉ]");
                    ds.themPhanTu();
                    break;

                case 2:
                    System.out.println("\n[DOANH THU]");
                    // Sử dụng printf để định dạng số tiền cho đẹp (ngăn cách hàng nghìn)
                    System.out.printf("Tổng tiền vé thu được: %,.0f VNĐ\n", ds.TongTien());
                    break;

                case 3:
                    System.out.println("\n[THỐNG KÊ]");
                    System.out.println("Số lượng vé từng phần đã bán: " + ds.demVeTungPhan() + " vé");
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Chức năng không tồn tại. Vui lòng chọn lại!");
            }
        } while (luaChon != 0);
    }
}