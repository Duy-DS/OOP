public class PMThietBi extends PhieuMuon{
    private String loaiThietBi;
    private double soGioMuon;

    public PMThietBi(){
        super();
        loaiThietBi="";
        soGioMuon=0;
    }

    public PMThietBi(String loaiThietBi, double soGioMuon, String maPM, String tenDocGia, String ngayMuon, String soDienThoai){
        super(maPM, tenDocGia, ngayMuon, soDienThoai);
        this.loaiThietBi=loaiThietBi;
        this.soGioMuon=soGioMuon;
    }

    @Override
    public double tinhPhiMuon(){
        if(soGioMuon>=2) return 20000;
        else return 20000+((soGioMuon-2)*10000);
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Loai thiet bi: "+loaiThietBi);
        System.out.println("So gio muon: "+ soGioMuon);
        System.out.println("Phi Muon: "+tinhPhiMuon());
    }
}
