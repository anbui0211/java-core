package chapter9;

import java.util.Scanner;

public class Video52 {
    public static void main(String[] args) {
        System.out.println("Nahp x");
        Scanner scanner = new Scanner(System.in);

            try {
            int x = scanner.nextInt();
            System.out.println("Ket qua 10/x" + 10 / x);
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}