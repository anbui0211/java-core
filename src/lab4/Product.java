package lab4;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getTaxPrice() {
        return (double) price * tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product product = new Product(name, price, tax);
        return product;
    }

    public void xuatThongTin(Product pr) {
        System.out.println(pr.getName() + " " + pr.getPrice() + " " + pr.getTax());
    }

}