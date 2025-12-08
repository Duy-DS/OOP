public class HD2h extends HDChuyenPhat{
    private double khoangCach;

    public HD2h(double khoangCach, String maVD, String tenNguoiGui, String tenNguoiNhan, String diaChiNhan, double soKg){
        super(maVD, tenNguoiGui, tenNguoiNhan, diaChiNhan, soKg);
        this.khoangCach=khoangCach;
    }

    public double getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(double khoangCach) {
        this.khoangCach = khoangCach;
    }

    @Override
    public double tinhtien(){
        if(khoangCach<2) return 25000;
        else return 35000+ (khoangCach-2)*5000;
    }
}
