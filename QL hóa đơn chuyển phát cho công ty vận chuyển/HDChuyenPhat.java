public abstract class HDChuyenPhat {
    protected String maVD;
    protected String tenNguoiGui;
    protected String tenNguoiNhan;
    protected String diaChiNhan;
    protected double soKg;

    public HDChuyenPhat(){

    }

    public HDChuyenPhat(String maVD, String tenNguoiGui, String tenNguoiNhan, String diaChiNhan, double soKg){
        this.maVD = maVD;
        this.tenNguoiGui = tenNguoiGui;
        this.tenNguoiNhan=tenNguoiNhan;
        this.diaChiNhan=diaChiNhan;
        this.soKg=soKg;
    }

    public String getMaVD() {
        return maVD;
    }

    public void setMaVD(String maVD) {
        this.maVD = maVD;
    }

    public String getTenNguoiGui() {
        return tenNguoiGui;
    }

    public void setTenNguoiGui(String tenNguoiGui) {
        this.tenNguoiGui = tenNguoiGui;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public double getSoKg() {
        return soKg;
    }

    public void setSoKg(double soKg) {
        this.soKg = soKg;
    }

    public abstract double tinhtien();
}
