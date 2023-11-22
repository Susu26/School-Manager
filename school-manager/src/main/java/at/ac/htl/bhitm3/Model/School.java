package at.ac.htl.bhitm3.Model;

import java.util.LinkedList;
import java.util.List;

public class School {
    public static int studentNumberCount;
    private final List<SchoolClass> schoolClasses;
    private final List<Teacher> teachers;

    public List<SchoolClass> getSchoolClasses() {
        return this.schoolClasses;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public School() {
        schoolClasses = new LinkedList<>();
        teachers = new LinkedList<>();
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

    public static Teacher createTeacher() {
        return new Teacher();
    }

    public static Student createStudent() {
        studentNumberCount++;
        return new Student(studentNumberCount);
    }

    public boolean addSchoolClass(SchoolClass schoolClass) {
        return this.schoolClasses.add(schoolClass);
    }

    public boolean removeSchoolClass(SchoolClass schoolClass) {
        return this.schoolClasses.remove(schoolClass);
    }

    public boolean addTeacher(Teacher teacher) {
        return this.teachers.add(teacher);
    }

    public boolean removeTeacher(Teacher teacher) {
        return this.teachers.remove(teacher);
    }
}
