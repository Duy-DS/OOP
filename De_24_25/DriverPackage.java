public class DriverPackage extends GoiDV{
    private double phiTaiXe;

    public DriverPackage(double phiTaiXe, String tenGoi, double giaCoBan, int thoiGianToiThieu, int thoiGianToiDa){
        super(tenGoi, giaCoBan, thoiGianToiThieu, thoiGianToiDa);
        this.phiTaiXe=phiTaiXe;
    }

    @Override
    public double tinhChiPhi(int songay){
        return (giaCoBan+phiTaiXe)*songay;
    }
}
