public class VeTronGoi extends Ve{
    public VeTronGoi(){
        super();
    }

    public VeTronGoi(String hoTen, String namSinh, int soTroChoi){
        super(hoTen, namSinh, soTroChoi);
    }
    @Override
    public double TinhGiaVe(){
        return 200000;
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Gia ve: "+TinhGiaVe());
    }
}
