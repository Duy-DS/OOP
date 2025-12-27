public abstract class GoiDV {
    protected String tenGoi;
    protected double giaCoBan;
    protected int thoiGianToiThieu;
    protected int thoiGianToiDa;

    public GoiDV(){};

    public GoiDV(String tenGoi, double giaCoBan, int thoiGianToiThieu, int thoiGianToiDa){
        this.tenGoi=tenGoi;
        this.giaCoBan=giaCoBan;
        this.thoiGianToiThieu=thoiGianToiThieu;
        this.thoiGianToiDa=thoiGianToiDa;
    }

    public String getTenGoi() {
        return tenGoi;
    }



    public abstract double tinhChiPhi(int songay);

    public boolean kiemTraThoiGian(int songay){
        return songay >= thoiGianToiThieu && songay <= thoiGianToiDa;
    }
}
