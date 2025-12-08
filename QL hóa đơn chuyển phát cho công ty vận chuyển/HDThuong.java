public class HDThuong extends HDChuyenPhat{
    private int soLanGui;

    public HDThuong(int soLanGui, String maVD, String tenNguoiGui, String tenNguoiNhan, String diaChiNhan, double soKg){
        super(maVD, tenNguoiGui, tenNguoiNhan, diaChiNhan, soKg);
        this.soLanGui=soLanGui;
    }

    public int getSoLanGui() {
        return soLanGui;
    }

    public void setSoLanGui(int soLanGui) {
        this.soLanGui = soLanGui;
    }

    @Override
    public double tinhtien(){
        if (soLanGui<3) return soKg*8000;
        else return soKg*5000;
    }
}
