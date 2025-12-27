public class Xe {
    private String bienSo;
    private String loaiXe;
    private boolean status;

    public Xe(){}

    public Xe(String bienSo, String loaiXe){
        this.bienSo=bienSo;
        this.loaiXe=loaiXe;
        this.status=true;
    }

    public String GetterBienSo(){
        return bienSo;
    }
    public void SetterBienSo(String bienSo){
        this.bienSo=bienSo;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public boolean isAvai(){return status;}
    public void setStatus() {
        this.status = false;
    }


}
