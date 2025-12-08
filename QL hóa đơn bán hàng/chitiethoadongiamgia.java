import java.util.Scanner;

public class chitiethoadongiamgia extends chitiethoadon{
    private double tiengiamgia;

    public chitiethoadongiamgia(){
        super();
    }

    public chitiethoadongiamgia(double tiengiamgia, sanPham sp, String maHD, int sl_ban){
        super(maHD, sp, sl_ban);
        this.tiengiamgia = tiengiamgia;
    }

    @Override
    public void nhapHD(){
        super.nhapHD();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien giam gia:");
        tiengiamgia= sc.nextDouble();
    }

    @Override
    public double thanhtien(){
        return super.thanhtien()-tiengiamgia;
    }

    @Override
    public void xuatHD(){
        super.xuatHD();
        System.out.println("Tien giam gia: "+ tiengiamgia);
        System.out.println("Thành tiền sau giảm giá: "+ thanhtien());
    }

}
