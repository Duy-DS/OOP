//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BangSapXep QL = new BangSapXep();

        PhongHoc p1 = new PhongLyThuyet(true, "A101", 35);
        PhongHoc p2 = new PhongHoiThao("A601", 300);
        PhongHoc p3 = new PhongMayTinh(40, "B101", 45);

        LopHoc l1 = new LopHoc("DDU1231", 40);
        LopHoc l2 = new LopHoc("DDU1232", 60);

        QL.themSapXep(p1, l1, "Sang thu 3");
        QL.themSapXep(p3, l1, "Chieu thu 5");
        QL.themSapXep(p2, l2, "Chieu thu 6");

        QL.inPhongTieuChuanCao();
    }
}