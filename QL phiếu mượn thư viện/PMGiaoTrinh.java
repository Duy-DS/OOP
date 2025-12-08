public class PMGiaoTrinh extends PhieuMuon{
    private int soLuong;
    private String tinhTrang;

    public PMGiaoTrinh(){
        super();
        soLuong=0;
        tinhTrang="";
    }

    public PMGiaoTrinh(int soLuong, String tinhTrang, String maPM, String tenDocGia, String ngayMuon, String soDienThoai){
        super(maPM, tenDocGia, ngayMuon, soDienThoai);
        this.soLuong=soLuong;
        this.tinhTrang=tinhTrang;
    }

    @Override
    public double tinhPhiMuon(){
        if (soLuong<5) return soLuong*2000;
        else return (soLuong*2000)*0.8;
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("soLuong: "+ soLuong);
        System.out.println("Tinh trang: "+ tinhTrang);
        System.out.println("Phi Muon: "+ tinhPhiMuon());
    }

}
