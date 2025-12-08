//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        hoaDon hd = new hoaDon();
        hd.nhap();

        System.out.println("Thong tin hoa don: ");
        hd.xuat();
        System.out.println("Tổng tiền của hóa đơn: "+hd.tongThanhTien());
    }
}