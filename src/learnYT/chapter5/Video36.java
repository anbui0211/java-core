package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Video36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNum = new ArrayList<Integer>();

        while (true) {
            System.out.println("Nhap so i: ");
            Integer input = scanner.nextInt();
            arrNum.add(input);

            scanner.nextLine(); // Enter

            System.out.println("Ban co muon nhap nua ko? Y or N");
            String check = scanner.nextLine();
            if (check.equals("N") || check.equals("n")){
                break;
            }
        }

        int total = 0;
        for(int i=0; i<arrNum.size(); i ++){
            total+= arrNum.get(i);
        }
        System.out.println("Total: " + total);
    }
}
