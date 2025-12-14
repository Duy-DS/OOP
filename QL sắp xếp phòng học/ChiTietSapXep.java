public class ChiTietSapXep {
    private PhongHoc phong;
    private LopHoc lop;
    private String kipHoc;

    public ChiTietSapXep(PhongHoc phong, LopHoc lop, String kipHoc){
        this.phong=phong;
        this.lop =lop;
        this.kipHoc=kipHoc;
    }

    public PhongHoc getPhong() {
        return phong;
    }

    @Override
    public String toString(){
        return "Kip: " + kipHoc + " - " + phong.getTenPhong() + " - " + lop.toString();
    }
}
