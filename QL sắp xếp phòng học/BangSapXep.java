import java.util.ArrayList;
import java.util.List;

public class BangSapXep {
    private List<ChiTietSapXep> danhsachsapxep;

    public BangSapXep(){
        this.danhsachsapxep = new ArrayList<>();
    }

    public void themSapXep(PhongHoc p, LopHoc l, String kip){
        danhsachsapxep.add(new ChiTietSapXep(p,l,kip));
    }

    public void inPhongTieuChuanCao(){
        System.out.println("Danh sach phong co tieu chuan > 100");
        for (ChiTietSapXep i: danhsachsapxep){
            if (i.getPhong().TieuChuanPhucVu()>100){
                System.out.println(i.toString() + " Diem phuc vu: " + i.getPhong().TieuChuanPhucVu());
            }
        }
    }


}
