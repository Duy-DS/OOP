public class VeTungPhan extends Ve{
    public VeTungPhan(){
        super();
    }

    public VeTungPhan(String hoTen, String namSinh, int soTroChoi){
        super(hoTen, namSinh, soTroChoi);
    }

    @Override
    public double TinhGiaVe(){
        return 70000+(soTroChoi*20000);
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Gia ve: "+TinhGiaVe());
    }
}
