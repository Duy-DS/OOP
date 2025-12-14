public class LopHoc {
    private int maLop;
    private String tenLop;
    private int siSo;

    private static int demLop=100;

    public LopHoc(String tenLop, int siSo){
        this.maLop=demLop++;
        this.tenLop=tenLop;
        this.siSo=siSo;
    }

    public int getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo(){
        return siSo;
    }

    public void getSiSo(int siSo){
        this.siSo=siSo;
    }

    @Override
    public String toString(){
        return "Lop: "+ tenLop + " Ma: " + maLop + " si so: " + siSo;
    }
}
