//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import lab4.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Product p1 = product.nhapThongTin("Iphone 13", 100000, 12.3);
        product.xuatThongTin(p1);
    }
}
