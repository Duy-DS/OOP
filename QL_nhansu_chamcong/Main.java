import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<PhongBan> dsPB = new ArrayList<>();
        PhongBan pbIT = new PhongBan("IT", "Lap trinh", 2.0);
        PhongBan pbHR = new PhongBan("HR", "Tuyen nhan su", 1.0);
        PhongBan pbKeToan = new PhongBan("Ke Toan", "Thong ke so sach", 2.5);

        dsPB.add(pbIT);
        dsPB.add(pbHR);
        dsPB.add(pbKeToan);

        QuanLyNhanSu QL = new QuanLyNhanSu();
        QL.themNhanVien(new NhanVienChinhThuc(2, "Duy", "Dong Nai", "03453455", pbIT, 30));
        QL.themNhanVien(new NhanVienThoiVu(7.9, "Duyen", "Ha Noi", "0943553", pbHR, 28));

        QL.find_nhanvien_luongcaonhat();
        QL.lietKeDanhSach(dsPB);
    }
}