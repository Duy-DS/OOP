public class PMTaiLieuSo extends PhieuMuon{
    private double dungLuongMB;

    public PMTaiLieuSo(){
        super();
        dungLuongMB=0;
    }

    public PMTaiLieuSo(double dungLuongMB, String maPM, String tenDocGia, String ngayMuon, String soDienThoai){
        super(maPM, tenDocGia, ngayMuon, soDienThoai);
        this.dungLuongMB=dungLuongMB;
    }

    @Override
    public double tinhPhiMuon(){
        return 10000+(dungLuongMB*200);
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Dung luong: "+ dungLuongMB);
        System.out.println("Phi Muon: "+ tinhPhiMuon());
    }
}
