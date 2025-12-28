import java.util.ArrayList;

public class danhSachSinhVien {
    ArrayList<sinhVien> list;

    public danhSachSinhVien(){
        this.list=new ArrayList<>();
    }

    public void themSV(sinhVien sv){
        list.add(sv);
    }

    public sinhVien findsv(String tencantim){
        for(sinhVien sv: list){
            if(sv.getHoten().equalsIgnoreCase(tencantim)){
                return sv;
            }
        }
        return null;
    }

    public void hienthiDS(){
        System.out.println("DS SV");
        for(sinhVien sv: list){
            System.out.println(sv.toString());
        }
    }
}
