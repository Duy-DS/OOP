public class NhanVienThoiVu extends NhanVien{
    private double heSoNangSuat;

    public NhanVienThoiVu(){
        super();
        heSoNangSuat=0;
    }

    public NhanVienThoiVu(double heSoNangSuat, String hoTen, String diaChi, String sdt, PhongBan PB, int soNgayCong){
        super(hoTen, diaChi, sdt, PB, soNgayCong);
        this.heSoNangSuat=heSoNangSuat;
    }

    @Override
    public double tinhLuong() {
        return heSoNangSuat*soNgayCong*150000;
    }
}
