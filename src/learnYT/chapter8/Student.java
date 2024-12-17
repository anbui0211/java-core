package chapter8;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        int mark = this.mark;
        if (mark >= 8) {
            this.grade = "A";
        } else if (mark >= 7) {
            this.grade = "B";
        } else if (mark >= 6) {
            this.grade = "C";
        } else {
            this.grade = "D";
        }
    }

    @Override
    public String toString() {
        return "Student [mark=" + mark + ", grade=" + grade + "]";
    }

}
