public class HDLe  extends hoaDon{
    private boolean isCuoiTuan;

    public HDLe(){
        super();
    }
    public HDLe(boolean isCuoiTuan, String maHD, String tenKhachHang, String ngayLap, double tongGiaTri){
        super(maHD, tenKhachHang, ngayLap, tongGiaTri);
        this.isCuoiTuan=isCuoiTuan;
    }

    @Override
    public double tinhThanhTien(){
        if (isCuoiTuan) return tongGiaTri - 1000;
        return tongGiaTri;
    }
}
