package chapter9;

import java.util.Scanner;

public class Video53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            System.out.println("RUN TRY");
        } catch (Exception e) {
            System.out.println("RUN CATCH");
        } finally {
            System.out.println("RUN FINALLY");
            scanner.close();
        }
    }
}
