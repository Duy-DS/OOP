public class BasicPackage extends GoiDV{

    public BasicPackage(String tenGoi, double giaCoBan, int thoiGianToiThieu, int thoiGianToiDa){
        super(tenGoi, giaCoBan, thoiGianToiThieu, thoiGianToiDa);
    }

    @Override
    public double tinhChiPhi(int songay){
        return giaCoBan*songay;
    }
}
