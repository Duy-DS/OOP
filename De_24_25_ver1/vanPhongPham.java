import java.util.Scanner;

public class vanPhongPham {
    protected String maVPP;
    protected String tenVPP;
    protected double donGia;

    public vanPhongPham(){
    }

    public vanPhongPham(String maVPP, String tenVPP, double donGia){
        this.maVPP=maVPP;
        this.tenVPP=tenVPP;
        this.donGia=donGia;
    }

    public void nhapTT(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma VPP");
        this.maVPP = sc.nextLine();

        System.out.print("Nhap ten VPP");
        this.tenVPP= sc.nextLine();

        System.out.println("nhap don gia");
        this.donGia= sc.nextDouble();
    }

    public void xuatTT(){
        System.out.println(maVPP + " - " + tenVPP + " - " + donGia);
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
