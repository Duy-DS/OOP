public class sinhVien2 implements CapNhatDiem{
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String nganh;
    private double diemTB;

    @Override
    public void capNhatDiem(double diemmoi){
        this.diemTB=diemmoi;
    }
}
