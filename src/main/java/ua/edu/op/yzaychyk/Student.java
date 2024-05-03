package ua.edu.op.yzaychyk;

/**
 * @author YZaychyk
 * @since 1.0
 **/
public class Student {
    private String nameAndSurname;
    private int score;

    public Student(String nameAndSurname, int score) {
        this.nameAndSurname = nameAndSurname;
        this.score = score;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 75);
        Student student2 = new Student("Grace McDonald", 95);

        System.out.println("Student #1" + student1.getNameAndSurname() + " has score " + student1.getScore());
        System.out.println("Student #2" + student2.getNameAndSurname() + " has score " + student2.getScore());
    }
}
