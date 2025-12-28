public class sinhVien {
    private String mssv;
    private String hoten;
    private String ngaySinh;
    private String nganh;
    private double dtbTichLuy;

    public sinhVien(){}

    public sinhVien(String mssv, String hoten, String ngaySinh, String nganh, double dtbTichLuy){
        this.mssv=mssv;
        this.hoten=hoten;
        this.ngaySinh=ngaySinh;
        this.nganh=nganh;
        this.dtbTichLuy=dtbTichLuy;
    }

    public String getHoten() {
        return hoten;
    }

    @Override
    public String toString(){
        return "mssv: "+ mssv + " hoten: "+ hoten+ " ngaySinh: "+ngaySinh+" nganh "+nganh+ " dtbTichLuy: "+dtbTichLuy;
    }
}
