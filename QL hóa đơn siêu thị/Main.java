//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        hoaDon hd1 = new HDLe(true, "HD001", "Duy", "10/12/2025", 1245334);
        hoaDon hd2 = new HDBuon(5, "HD002", "duyen", "10/12/2025", 143545);
        hoaDon hd3 = new HDOnline(2.5, "HD003", "Dung", "10/12/2025", 356345);

        QuanLyHoaDon dsHD = new QuanLyHoaDon();
        dsHD.themHoaDon(hd1);
        dsHD.themHoaDon(hd2);
        dsHD.themHoaDon(hd3);

        System.out.println("Tong doanh thu: "+ dsHD.tongDoanhThu());
        dsHD.xuatDanhSach();
    }
}