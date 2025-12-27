public class PremiumPackage extends GoiDV{
    private double phiTaiXe;
    private double phiBH;

    public PremiumPackage(double phiTaiXe, double phiBH, String tenGoi, double giaCoBan, int thoiGianToiThieu, int thoiGianToiDa){
        super(tenGoi, giaCoBan, thoiGianToiThieu, thoiGianToiDa);
        this.phiTaiXe=phiTaiXe;
        this.phiBH=phiBH;
    }

    @Override
    public double tinhChiPhi(int songay){
        return (giaCoBan+phiTaiXe+phiBH)*songay;
    }
}
