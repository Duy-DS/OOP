abstract class PhieuMuon {
    protected String maPM;
    protected String tenDocGia;
    protected String ngayMuon;
    protected String soDienThoai;

    public PhieuMuon(){
        maPM="";
        tenDocGia="";
        ngayMuon="";
        soDienThoai="";
    }

    public PhieuMuon(String maPM, String tenDocGia, String ngayMuon, String soDienThoai){
        this.maPM=maPM;
        this.tenDocGia=tenDocGia;
        this.ngayMuon=ngayMuon;
        this.soDienThoai=soDienThoai;
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    abstract double tinhPhiMuon();

    public void xuatThongTin(){
        System.out.println("maPM: "+ maPM);
        System.out.println("tenDocGia: "+ tenDocGia);
        System.out.println("ngayMuon: "+ ngayMuon);
        System.out.println("soDienThoai: "+ soDienThoai);
    }
}
