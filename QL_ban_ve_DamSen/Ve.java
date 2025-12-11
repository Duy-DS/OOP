public abstract class Ve {
    protected int maVe;
    protected String hoTen;
    protected String namSinh;
    protected int soTroChoi;

    private static int count = 0;

    public Ve(){
        maVe=count++;
        hoTen="";
        namSinh="";
        soTroChoi=0;
    }

    public Ve(String hoTen, String namSinh, int soTroChoi){
        this.maVe=count++;
        this.hoTen=hoTen;
        this.namSinh=namSinh;
        this.soTroChoi=soTroChoi;
    }

    public int getMaVe() {
        return maVe;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setSoTroChoi(int soTroChoi) {
        this.soTroChoi = soTroChoi;
    }

    public int getSoTroChoi() {
        return soTroChoi;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public abstract double TinhGiaVe();

    public void xuatThongTin(){
        System.out.println("Ma: "+maVe+", Ten: "+hoTen+", Nam sinh: "+namSinh+", sotrochoi: "+soTroChoi);
    }
}
