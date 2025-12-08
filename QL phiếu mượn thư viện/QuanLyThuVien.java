import java.util.ArrayList;

public class QuanLyThuVien {
    private ArrayList<PhieuMuon> danhsach;

    public QuanLyThuVien(){
        danhsach = new ArrayList<>();
    }

    public void themPhieuMuon (PhieuMuon PM){
        danhsach.add(PM);
    }

    public double tinhTong(){
        double sum=0;
        for (PhieuMuon PM: danhsach){
            sum+= PM.tinhPhiMuon();
        }
        return sum;
    }

    public void xuatDanhSach(){
        for (PhieuMuon PM: danhsach)
            PM.xuatThongTin();
    }
}
