public class Student {
    private String mssv;
    private FullName hoTen;
    private Address diaChi;

    public Student(String mssv, FullName hoTen, Address diaChi){
        this.mssv=mssv;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
    }

    public void setStudentID(String mssv){
        this.mssv=mssv;
    }

    public void setFName(FullName hoTen){
        this.hoTen=hoTen;
    }

    public void setAddress(Address diaChi){
        this.diaChi=diaChi;
    }

    public String getStudentID(){
        return mssv;
    }

    public FullName getFName(){
        return hoTen;
    }

    public Address getAddress(){
        return diaChi;
    }

    public void printStudent(){
        System.out.println("Mssv: "+ mssv);
        System.out.println("ho ten: "+ hoTen);
        System.out.println("Dia chi: "+ diaChi);
    }
}
