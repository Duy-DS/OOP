public class Address {
    private String soNha;
    private String duong;
    private String quan;
    private String tp;

    public Address(String soNha, String duong, String quan, String tp){
        this.soNha=soNha;
        this.duong=duong;
        this.quan=quan;
        this.tp=tp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "soNha='" + soNha + '\'' +
                ", duong='" + duong + '\'' +
                ", quan='" + quan + '\'' +
                ", tp='" + tp + '\'' +
                '}';
    }
}
