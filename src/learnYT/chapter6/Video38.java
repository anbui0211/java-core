package chapter6;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Video38 {

    public static void main(String[] args) {
        Student st1 = new Student(01, "Bui Phu An");
        Student st2 = new Student(01, "Bui Phu Huy");
        Student st3 = new Student(01, "Thanh THu");
        Student st4 = new Student(01, "Dang Dinh");
        Student st5 = new Student(01, "Minh Phuong");

        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Start with " + arr.get(i));
            if (arr.get(i).getName().startsWith("Bui")) {
                System.out.println("Start with " + arr.get(i));
            }
        }

        Pattern.compile("");
    }
}