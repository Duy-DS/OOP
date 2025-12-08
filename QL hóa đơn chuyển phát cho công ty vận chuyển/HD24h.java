public class HD24h extends HDChuyenPhat{

    public HD24h(String maVD, String tenNguoiGui, String tenNguoiNhan, String diaChiNhan, double soKg){
        super(maVD, tenNguoiGui, tenNguoiNhan, diaChiNhan, soKg);
    }

    @Override
    public double tinhtien(){
        return 20000+(soKg*2000);
    }
}
