import java.util.Scanner;

public class chitiethoadon {
    protected String maHD;
    protected sanPham sp;
    protected int sl_ban;

    public chitiethoadon(){
        this.maHD="";
        this.sp=new sanPham();
        this.sl_ban=0;
    }

    public chitiethoadon(String maHD, sanPham sp, int sl_ban){
        this.maHD = maHD;
        this.sp = sp;
        this.sl_ban=sl_ban;
    }

    public void nhapHD(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma hoa don");
        maHD = sc.nextLine();

        System.out.println("Nha thong tin san pham");
        sp = new sanPham();
        sp.nhapTTSP();

        System.out.println("Nhap so luong ban");
        sl_ban= sc.nextInt();
    }

    public double thanhtien(){
        return sl_ban* sp.getPrice();
    }

    public void xuatHD(){
        System.out.println("Ma hoa don:" + maHD);
        System.out.println("San pham:");
        sp.xuatTTSP();
        System.out.println("So luong ban: "+sl_ban);
        System.out.println("Thanh tien: "+ thanhtien());
    }

}
