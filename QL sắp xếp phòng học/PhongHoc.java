public abstract class PhongHoc {
    protected int maPhong;
    protected String tenPhong;
    protected int soGhe;
    private static int num=100;

    public PhongHoc(){
        maPhong=num++;
        tenPhong="";
        soGhe = 0;
    }

    public PhongHoc(String tenPhong, int soGhe){
        this.maPhong=num++;
        this.tenPhong=tenPhong;
        this.soGhe=soGhe;
    }

    public String getTenPhong(){
        return tenPhong;
    }

    public void setTenPhong(String tenPhong){
        this.tenPhong=tenPhong;
    }

    public int getSoGhe(){
        return soGhe;
    }

    public void setSoGhe(int soGhe){
        this.soGhe=soGhe;
    }

    public abstract double TieuChuanPhucVu();

}
