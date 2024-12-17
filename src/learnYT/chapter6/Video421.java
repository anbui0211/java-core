package chapter6;

public class Video421 {
    public static void main(String[] args) {
        SinhVienIT svit = new SinhVienIT("001", "Bui Phu An", 123, 123, "Java");
        SinhVienCoKhi svck = new SinhVienCoKhi("001", "Bui Phu Anmmmm", 123, 123, "go phim 10 ngon");
        System.out.println("St1 check: " + svit.getLanguage() + svit.id);
        System.out.println("Stck check: " + svck.name);
    }
}