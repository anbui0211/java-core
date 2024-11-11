package chapter6;

public class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, double price, double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }

    public void SetLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void getMoney() {
        System.out.println("run get money...");
        // this.info();
    }

    public void info() {
        System.out.println("run info from child");
    }

    @Override
    void TinhDiem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'TinhDiem'");
    }
}