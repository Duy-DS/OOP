//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Xe xe1= new Xe("60B7-4352", "Toyota");
        Xe xe2 = new Xe("59A3-2342", "Vin");
        Xe xe3 = new Xe("80A3-5342", "Mac");

        TaiXe tx1 = new TaiXe("tx001", "Duy nguyen");
        TaiXe tx2 = new TaiXe("tx002", "Duyen");

        GoiDV goicoban = new BasicPackage("Goi co ban", 50000, 1, 30);
        GoiDV goiCoTX = new DriverPackage(1200, "Goi co tai xe", 50000, 1, 30);
        GoiDV goiPre = new PremiumPackage(1200, 2000, "Goi pre", 50000, 1, 30);

        DonThue don1 = new DonThue(xe1, null, goicoban, 5);
        DonThue don2 = new DonThue(xe2, tx2, goiCoTX, 3);
        DonThue don3 = new DonThue(xe3, tx1, goiPre, 3);

        don1.xuLyDonHang();
        don2.xuLyDonHang();
        don3.xuLyDonHang();
    }
}