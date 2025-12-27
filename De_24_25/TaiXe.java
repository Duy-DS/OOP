public class TaiXe {
    private String maSo;
    private String hoTen;
    private boolean status;

    public TaiXe(){};

    public TaiXe(String maSo, String hoTen){
        this.hoTen=hoTen;
        this.maSo=maSo;
        this.status=true;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isAvai(){return status;}
    public void setStatus() {
        this.status = false;
    }
}
