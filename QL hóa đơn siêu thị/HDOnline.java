public class HDOnline extends hoaDon{
    private double khoangCach;

    public HDOnline(){
        super();
        khoangCach=0;
    }

    public HDOnline(double khoangCach, String maHD, String tenKhachHang, String ngayLap, double tongGiaTri){
        super(maHD, tenKhachHang, ngayLap, tongGiaTri);
        this.khoangCach=khoangCach;
    }

    @Override
    public double tinhThanhTien(){
        double phiShip;
        if(khoangCach<5) phiShip =15000;
        else phiShip = 15000 + (khoangCach-5)*2000;
        return tongGiaTri+phiShip;
    }
}
