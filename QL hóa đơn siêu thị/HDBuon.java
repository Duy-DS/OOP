public class HDBuon extends hoaDon{
    private int soLuongMatHang;

    public HDBuon(){
        super();
        soLuongMatHang=0;
    }

    public HDBuon(int soLuongMatHang, String maHD, String tenKhachHang, String ngayLap, double tongGiaTri){
        super(maHD, tenKhachHang, ngayLap, tongGiaTri);
        this.soLuongMatHang=soLuongMatHang;
    }

    @Override
    public double tinhThanhTien(){
        if (soLuongMatHang>10) return tongGiaTri*0.90;
        return tongGiaTri*0.95;
    }
}
