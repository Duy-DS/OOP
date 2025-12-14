public class PhongHoiThao extends PhongHoc{

    public PhongHoiThao(String tenPhong, int soGhe){
        super(tenPhong, soGhe);
    }

    @Override
    public double TieuChuanPhucVu(){
        if(soGhe>200)return soGhe*1.5;
        else return soGhe;
    }
}
