import java.util.Scanner;

public class hoaDon {
    private String maHD;
    private String ngayLapHD;
    private chitiethoadon[] dsct;
    private int soLuongCT;

    public hoaDon(){
        dsct = new chitiethoadon[20];
        soLuongCT=0;
    }

    public hoaDon(String maHD, String ngayLapHD){
        this();
        this.maHD=maHD;
        this.ngayLapHD=ngayLapHD;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap maHD: ");
        maHD= sc.nextLine();

        System.out.println("Nhap ngay lap hoa don: ");
        ngayLapHD=sc.nextLine();

        System.out.println("Nhap so chi tiet hoa don");
        soLuongCT=sc.nextInt();

        for (int i=0; i<soLuongCT; i++){
            System.out.println("Chọn loại chi tiết hóa đơn (1: thường; 2: giảm giá): ");
            int chon = sc.nextInt();
            sc.nextLine();

            chitiethoadon ct;

            if(chon==1){
                ct=new chitiethoadon();
            }
            else{
                ct=new chitiethoadongiamgia();
            }

            ct.nhapHD();
            dsct[i]=ct;
        }
    }

    public void xuat(){
        System.out.println("Thong tin hoa don");
        System.out.println("MaHD: "+ maHD);
        System.out.println("Ngay lap: "+ ngayLapHD);
        System.out.println("So chi tiet:"+ soLuongCT);

        for(int i=0; i<soLuongCT;i++){
            dsct[i].xuatHD();
            System.out.println();
        }

        System.out.println("tong tien: "+tongThanhTien());
    }

    public double tongThanhTien(){
        double sum = 0;

        for(int i = 0; i< soLuongCT;i++){
            sum+= dsct[i].thanhtien();
        }

        return sum;
    }
}
