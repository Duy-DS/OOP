public class PhongBan {
    private static int count =100;// Biến tĩnh dùng chung cho cả lớp, lưu giá trị đếm hiện tại
    private int maPB;
    private String tenPB;
    private String moTa;
    private double heSoCongViec;

    public PhongBan(){
        maPB=0;
        tenPB="";
        moTa="";
        heSoCongViec=0;
    }

    public PhongBan(String tenPB, String moTa, double heSoCongViec){
        this.maPB=count++;
        this.tenPB=tenPB;
        this.moTa=moTa;
        this.heSoCongViec=heSoCongViec;
    }

    public int getMaPB() {
        return maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getHeSoCongViec() {
        return heSoCongViec;
    }

    public void setHeSoCongViec(double heSoCongViec) {
        this.heSoCongViec = heSoCongViec;
    }

    public String toString(){
        return "maPB: "+ maPB + "\ntenPB: " + tenPB + "\nmo Ta: "+ moTa + "\nhesocongviec: "+ heSoCongViec;
    }
}
