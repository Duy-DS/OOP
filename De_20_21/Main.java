//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address diachi1= new Address("149/N", "Tran Tuan Khai", "Quan 5", "HCM");

        FullName hoten = new FullName("Nguyen", "Tan", "Duy");

        Student hs = new Student("3123580008", hoten, diachi1);

        hs.printStudent();
    }
}