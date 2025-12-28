import java.util.ArrayList;

public class danhSachLopHoc {
    ArrayList<lopHoc> list;

    public danhSachLopHoc(){
        this.list=new ArrayList<>();
    }

    public void themLopHoc(lopHoc l){
        list.add(l);
    }

    public void hienthiDSLopHoc(){
        for(lopHoc l: list){
            System.out.println(l.toString());
            l.getDssv().toString();
        }
    }
}
