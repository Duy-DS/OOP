import java.util.Scanner;

public class Tap extends vanPhongPham{
    private int soTrang;

    public Tap(){}

    public Tap(String maVPP, String tenVPP, double donGia, int soTrang){
        super(maVPP, tenVPP, donGia);
        this.soTrang=soTrang;
    }
    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so trang");
        this.soTrang=sc.nextInt();
    }

    @Override
    public void xuatTT(){
        super.xuatTT();
        System.out.println("so trang: "+soTrang);
    }
}
