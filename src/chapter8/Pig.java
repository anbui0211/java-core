package chapter8;

public class Pig implements IAnimal {

    @Override
    public void animalSound() {
        System.out.println("Pig say: wewe ...");
    }

    @Override
    public void run() {
        System.out.println("Zzzz");
    }

}
