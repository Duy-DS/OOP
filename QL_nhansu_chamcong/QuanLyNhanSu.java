import java.util.ArrayList;

public class QuanLyNhanSu {
    private ArrayList<NhanVien> dsNV;

    public QuanLyNhanSu(){
        dsNV = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv){
        dsNV.add(nv);
    }

    public double tongLuong(){
        double sum=0;
        for (NhanVien nv: dsNV){
            sum+= nv.tinhLuong();
        }
        return sum;
    }

    public void find_nhanvien_luongcaonhat(){
        if (dsNV.isEmpty())return;

        NhanVien luong_nv_caonhat = dsNV.get(0);

        for(NhanVien nv: dsNV){
            if( luong_nv_caonhat.tinhLuong()<nv.tinhLuong()) {
                luong_nv_caonhat = nv;
            }
        }
        System.out.println("Nhan vien co luong cao nhat");
        System.out.println(luong_nv_caonhat.toString()+" lương: "+luong_nv_caonhat.tinhLuong());

    }

    public void lietKeDanhSach(ArrayList<PhongBan> dsPhongBan){
        for(PhongBan PB: dsPhongBan){
            System.out.println("Phong: "+PB.getTenPB()+" MaPB: "+PB.getMaPB());

            boolean coNV = false;

            for (NhanVien NV: dsNV){
                if(NV.PB.getMaPB()==PB.getMaPB()){
                    System.out.println(NV.toString());
                    System.out.println("--");
                    coNV = true;
                }
            }
            if (!coNV) System.out.println("Chua co NV");
        }
    }
}
