package at.ac.htl.bhitm3.Model;

public class Student extends Person {
    private final int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
