public class NhanVienChinhThuc extends NhanVien{
    private int bacLuong;

    public NhanVienChinhThuc(){
        super();
        bacLuong=1;
    }

    public NhanVienChinhThuc(int bacLuong, String hoTen, String diaChi, String sdt, PhongBan PB, int soNgayCong){
        super(hoTen, diaChi, sdt, PB, soNgayCong);
        this.bacLuong=bacLuong;
    }

    @Override
    public double tinhLuong(){
        return bacLuong* PB.getHeSoCongViec()* soNgayCong*100000;
    }
}
