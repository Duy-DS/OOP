import java.util.Scanner;

public class Viet extends vanPhongPham{
    private String mauMuc;

    public Viet(){}

    public Viet(String maVPP, String tenVPP, double donGia, String mauMuc){
        super(maVPP, tenVPP, donGia);
        this.mauMuc=mauMuc;
    }

    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap mau muc");
        this.mauMuc=sc.nextLine();
    }

    @Override
    public void xuatTT(){
        super.xuatTT();
        System.out.println("mau muc: "+mauMuc);
    }
}
