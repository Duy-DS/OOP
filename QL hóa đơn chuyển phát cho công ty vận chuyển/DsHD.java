import java.util.Scanner;

public class DsHD {
    private HDChuyenPhat[] ds;
    private int sl;

    public DsHD(){
        ds = new HDChuyenPhat[0];
        sl = 0;
    }

    public void addHD(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong HD");
        System.out.print("maVD");
        String maVD = sc.nextLine();

        System.out.print("ten nguoi gui");
        String tenGui = sc.nextLine();

        System.out.print("ten nguoi nhan");
        String tenNhan = sc.nextLine();

        System.out.print("dia chi nhan");
        String diachi = sc.nextLine();

        System.out.print("so kg");
        double soKg = Double.parseDouble(sc.nextLine());

        System.out.println("chọn loại HĐ");
        System.out.println("1. HĐ Thường");
        System.out.println("2. HĐ 24h");
        System.out.println("3. HĐ 2h");

        int chon = Integer.parseInt(sc.nextLine());

        HDChuyenPhat newHD = null;

        switch (chon){
            case 1:
                System.out.print("so lan gui:");
                int soLanGui = Integer.parseInt(sc.nextLine());
                newHD = new HDThuong(soLanGui, maVD, tenGui, tenNhan, diachi, soKg);
                break;

            case 2:
                newHD = new HD24h(maVD, tenGui, tenNhan, diachi, soKg);
                break;

            case 3:
                System.out.print("Khoang cach:");
                double khoangCach = Double.parseDouble(sc.nextLine());
                newHD = new HD2h(khoangCach, maVD, tenGui, tenNhan, diachi, soKg);
                break;

            default:return;
        }

        if (newHD !=null){
            ds[sl]=newHD;
            sl++;
        }
    }

    public double tongtien(){
        double sum = 0;
        for (int i=0; i<sl; i++){
            sum+= ds[i].tinhtien();
        }

        return sum;
    }

    public void xuatDanhSach() {
        System.out.println("\nDANH SÁCH HÓA ĐƠN:");
        for (int i = 0; i < sl; i++) {
            HDChuyenPhat hd = ds[i];
            System.out.printf("Mã: %s | Người gửi: %s | Tiền cước: %.0f VND\n",
                    hd.getMaVD(), hd.getTenNguoiGui(), hd.tinhtien());
        }
    }
}
