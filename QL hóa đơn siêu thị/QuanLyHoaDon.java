public class QuanLyHoaDon {
    private hoaDon[] dsHD;
    private int soLuongHienTai;

    public QuanLyHoaDon(){
        dsHD = new hoaDon[20];
        soLuongHienTai=0;
    }

    public void themHoaDon(hoaDon HD){
        if (soLuongHienTai<dsHD.length){
            dsHD[soLuongHienTai]=HD;
            soLuongHienTai++;
        }
    }

    public double tongDoanhThu(){
        double tong = 0;
        for(int i=0; i<soLuongHienTai; i++){
            tong+= dsHD[i].tinhThanhTien();
        }
        return tong;
    }

    public void xuatDanhSach(){
        for (int i=0; i<soLuongHienTai;i++){
            System.out.println("HD thu "+ (i+1)+ ": "+ dsHD[i].tinhThanhTien());
        }
    }
}
