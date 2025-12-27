import java.util.ArrayList;
import java.util.Scanner;

public class danhsachVPP {
    private ArrayList<vanPhongPham> list = new ArrayList<>();

    public void themVPP(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Chọn loại (1. Tap, 2. Viet): ");
        int chon = sc.nextInt();
        vanPhongPham vpp;
        if(chon==1) vpp = new Tap();
        else vpp = new Viet();

        vpp.nhapTT();
        list.add(vpp);
    }

    public void xuat(){
        for(vanPhongPham vpp: list){
            vpp.xuatTT();
            System.out.println();
        }
    }

    public void timGiaThapNhat(){
        if(list.isEmpty()) return;
        double min = list.get(0).getDonGia();
        for(vanPhongPham v: list){
            if(v.getDonGia()<min) min=v.getDonGia();
        }

        System.out.println("Các sản phẩm có giá thấp nhất ("+ min + ")");
        for(vanPhongPham v: list){
            if(v.getDonGia()==min) v.xuatTT();
        }
    }
}
