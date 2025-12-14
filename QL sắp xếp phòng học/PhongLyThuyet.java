public class PhongLyThuyet extends PhongHoc{
    private boolean coMayChieu;

    public PhongLyThuyet(){
        super();
    }

    public PhongLyThuyet(boolean coMayChieu, String tenPhong, int soGhe){
        super(tenPhong, soGhe);
        this.coMayChieu=coMayChieu;
    }

    @Override
    public double TieuChuanPhucVu(){
        if(coMayChieu){
            return soGhe+20;
        }
        else return soGhe;
    }

}
