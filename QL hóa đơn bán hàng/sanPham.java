import java.util.Scanner;

public class sanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double price;

    public sanPham(){
        this.maSP="";
        this.tenSP="";
        this.soLuong=0;
        this.price=0.0;
    }

    public sanPham(String maSP, String tenSP, int soLuong, double price){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.price = price;
    }

    public String getmaSP() {
        return maSP;
    }

    public void setmaSP(String maSP) {
        this.maSP = maSP;
    }

    public String gettenSP() {
        return tenSP;
    }

    public void settenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong>=0)
            this.soLuong = soLuong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0)
            this.price = price;
    }

    public void nhapTTSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sp");
        this.maSP = sc.nextLine();

        System.out.print("Nhap ten sp");
        this.tenSP = sc.nextLine();

        System.out.print("Nhập số lượng sp: ");
        soLuong = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        price = sc.nextDouble();

//        while (true){
//            System.out.println("Nhap sl:");
//            String line = sc.nextLine().trim();
//            int sl = Integer.parseInt(line);
//            if (sl<0){
//                System.out.println("Số lượng phải >= 0. Nhập lại.");
//                continue;
//            }
//            this.soLuong=sl;
//            break;
//        }

//        while (true){
//            System.out.println("Nhap don gia:");
//            String line = sc.nextLine().trim();
//            double dongia = Double.parseDouble(line);
//            if(dongia<0){
//                System.out.println("Đơn giá phải >= 0. Nhập lại.");
//                continue;
//            }
//            this.price=dongia;
//            break;
//        }
    }

    public String xuatTTSP(){
        return String.format("Product{maSP='%s', tenSP='%s', soLuong=%d, donGia=%.2f}", maSP, tenSP, soLuong, price);
    }
}
