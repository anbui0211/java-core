package chapter6;

public class Car extends Vehical {
    private String modelName = "Mustanger";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
        System.out.println("hello world");
    }
}
