import java.util.Scanner;

public class DanhSachVe {
    private Ve[] dsVe;

    private static int sl=0;

    public DanhSachVe(){
        dsVe = new Ve[100];
    }

    public void themPhanTu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon ve: 1-Tron Goi; 2-Tung phan");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.println("Ho ten: ");
        String ten = sc.nextLine();
        System.out.println("Nam Sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("So tro choi: ");
        int troChoi = Integer.parseInt(sc.nextLine());

        Ve veMoi;
        if(loai==1)
            veMoi=new VeTronGoi(ten, namSinh, troChoi);
        else if(loai==2)
            veMoi=new VeTungPhan(ten, namSinh, troChoi);
        else{
            System.out.println("KO hop le:");
            return;
        }
        dsVe[sl++]=veMoi;
    }

    public double TongTien(){
        double sum=0;
        for(int i =0; i<sl; i++){
            sum+= dsVe[i].TinhGiaVe();
        }
        return sum;
    }

    public int demVeTungPhan(){
        int count = 0;
        for(int i =0; i<sl;i++){
            if(dsVe[i] instanceof VeTungPhan) count++;
        }
        return count;
    }
}
