//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuanLyThuVien QL = new QuanLyThuVien();

        PhieuMuon pm1 = new PMGiaoTrinh(2, "Còn", "PM001", "Duy", "08/12/2025", "0981451700");

        PhieuMuon pm2 = new PMTaiLieuSo(200, "PM002", "Duyen", "07/12/2025", "03848285925");

        PhieuMuon pm3 = new PMThietBi("dia", 5.4, "PM003", "Dy", "09/12/2025", "084757645");

        QL.themPhieuMuon(pm1);
        QL.themPhieuMuon(pm2);
        QL.themPhieuMuon(pm3);

        QL.xuatDanhSach();

        QL.tinhTong();

    }
}