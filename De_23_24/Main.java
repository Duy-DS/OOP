//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sinhVien sv1 = new sinhVien("3123580001", "Duy", "14/10", "DS", 3.6);
        sinhVien sv2 =new sinhVien("3123590001", "Dy", "15/1", "Toan", 3.2);
        sinhVien sv3 = new sinhVien("SV03", "Le Van C", "03/03/2003", "Ngon Ngu", 6.5);
        sinhVien sv4 = new sinhVien("SV04", "Pham Thi D", "04/04/2003", "CNTT", 9.0);
        sinhVien sv5 = new sinhVien("SV05", "Hoang Van E", "05/05/2003", "Luat", 7.0);

        danhSachSinhVien dsSvKhoa = new danhSachSinhVien();
        dsSvKhoa.themSV(sv1);
        dsSvKhoa.themSV(sv2);
        dsSvKhoa.themSV(sv3);
        dsSvKhoa.themSV(sv4);
        dsSvKhoa.themSV(sv5);

        dsSvKhoa.hienthiDS();

        lopHoc lp1= new lopHoc("DDU1231");
        lopHoc lp2 = new lopHoc("DDT1224");

       String tenCanTim = "Duy";
       sinhVien svTimThay = dsSvKhoa.findsv(tenCanTim);

       if(svTimThay !=null){
           System.out.println(svTimThay.toString());
       }
       else System.out.println("ko tim thay");
    }
}