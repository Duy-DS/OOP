public class FullName {
    private String ho;
    private String tenDem;
    private String ten;

    public FullName(String ho, String tenDem, String ten){
        this.ho=ho;
        this.tenDem=tenDem;
        this.ten=ten;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "ho='" + ho + '\'' +
                ", tenDem='" + tenDem + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
