public class DonThue {
    private Xe xe;
    private TaiXe TX;
    private GoiDV goi;
    private int songaythue;

    public DonThue(Xe xe, TaiXe TX, GoiDV goi, int songaythue){
        this.xe=xe;
        this.TX=TX;
        this.goi=goi;
        this.songaythue=songaythue;
    }

    public void xuLyDonHang(){
        if(!goi.kiemTraThoiGian(songaythue)){
            System.out.println("LỖI: Số ngày thuê không phù hợp với quy định của gói " + goi.getTenGoi());
            return;
        }

        if(!xe.isAvai()){
            System.out.println("LỖI: Xe " + xe.GetterBienSo() + " hiện đang bận!");
            return;
        }

        if(!(goi instanceof BasicPackage)){
            if(TX==null){
                System.out.println("LỖI: Gói này yêu cầu phải có tài xế!");
                return;
            }
            if(!TX.isAvai()){
                System.out.println("LỖI: Tài xế " + TX.getHoTen() + " hiện đang bận!");
                return;
            }
        }

        xe.setStatus();
        if(TX!=null) TX.setStatus();

        double tongTien = goi.tinhChiPhi(songaythue);
        System.out.println("THÀNH CÔNG: Đã đặt thuê!");
        System.out.println("=> Gói: " + goi.getTenGoi());
        System.out.println("=> Tổng chi phí: " + String.format("%,.0f", tongTien) + " VNĐ");
    }

}
