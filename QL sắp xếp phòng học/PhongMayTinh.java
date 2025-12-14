public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    public PhongMayTinh(){
        super();
    }

    public PhongMayTinh(int soMayTinh, String tenPhong, int soGhe){
        super(tenPhong, soGhe);
        this.soMayTinh=soMayTinh;
    }

    @Override
    public double TieuChuanPhucVu(){
        return soMayTinh*2;
    }
}
