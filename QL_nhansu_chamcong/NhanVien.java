public abstract class NhanVien {
    private static int count = 100;
    protected int maNV;
    protected String hoTen;
    protected String diaChi;
    protected String sdt;
    protected PhongBan PB;
    protected int soNgayCong;

    public NhanVien(){
        maNV=0;
        hoTen="";
        diaChi="";
        sdt="";
        PB = new PhongBan();
        soNgayCong=0;
    }

    public NhanVien(String hoTen, String diaChi, String sdt, PhongBan PB, int soNgayCong){
        this.maNV=count++;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.sdt=sdt;
        this.PB = PB;
        this.soNgayCong=soNgayCong;
    }

    public abstract double tinhLuong();

    public String toString(){
        return "maNV: "+ maNV + "\n ten: " + hoTen + "\n dia chi: "+ diaChi + "\n sdt: "+ sdt+ "\n phong ban: "+ PB.toString();
    }
}
