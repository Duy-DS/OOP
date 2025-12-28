import java.util.ArrayList;

public class lopHoc {
    private String maLop;
    private ArrayList<sinhVien> dssv;

    public lopHoc(){}

    public lopHoc(String maLop){
        this.maLop=maLop;
        this.dssv= new ArrayList<>();
    }

    public ArrayList<sinhVien> getDssv() {
        return dssv;
    }

    @Override
    public String toString() {
        return "lopHoc{" +
                "maLop='" + maLop + '\'' +
                ", dssv=" + dssv +
                '}';
    }
}
