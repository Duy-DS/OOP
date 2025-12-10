 public abstract class hoaDon {
    protected String maHD;
    protected String tenKhachHang;
    protected String ngayLap;
    protected double tongGiaTri;

    public hoaDon(){
        maHD="";
        tenKhachHang="";
        ngayLap="";
        tongGiaTri=0;
    }

    public hoaDon(String maHD, String tenKhachHang, String ngayLap, double tongGiaTri){
        this.maHD=maHD;
        this.tenKhachHang=tenKhachHang;
        this.ngayLap=ngayLap;
        this.tongGiaTri=tongGiaTri;
    }

    public String getmaHD(){
        return maHD;
    }

    public void setmaHD(String maHD){
        this.maHD=maHD;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setTongGiaTri(double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public double getTongGiaTri() {
        return tongGiaTri;
    }

    public abstract double tinhThanhTien();
}
