package at.ac.htl.bhitm3.Model;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SchoolClass {
    private final Map<Integer, Student> students = new HashMap<>();

    public List<Student> getStudents() {
        return new LinkedList<>(this.students.values());
    }

    public boolean addStudent(Student student) {
        if (student != null) {
            this.students.put(student.getStudentNumber(), student);
            return true;
        }

        return false;
    }

    public boolean removeStudent(int studentNumber) {
        return this.students.remove(studentNumber) != null;
    }

    public Student getStudent(int studentNumber) {
        return this.students.get(studentNumber);
    }
}
