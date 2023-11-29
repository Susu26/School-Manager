package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolClassTest {
    private SchoolClass schoolClass;

    @Before public void setUp() {
        schoolClass = School.createSchoolClass();
    }

    @Test public void give_new_school_class_when_counting_students_is_zero() {
        assertEquals(0, schoolClass.getStudents().size());
    }

    @Test
    public void given_new_school_when_adding_student_then_result_is_added_student() {
        var student = School.createStudent();

        assertTrue(schoolClass.addStudent(student));
        assertEquals(1, schoolClass.getStudents().size());
        assertEquals(student, schoolClass.getStudents().get(0));
    }

    @Test
    public void given_new_school_when_adding_student_with_value_null_result_is_false() {
        assertFalse(schoolClass.addStudent(null));
    }

    @Test
    public void given_new_school_add_and_remove_student_when_counting_students_then_result_is_zero() {
        var student = School.createStudent();

        assertTrue(schoolClass.addStudent(student));
        assertEquals(1, schoolClass.getStudents().size());
        assertEquals(student, schoolClass.getStudents().get(0));

        assertTrue(schoolClass.removeStudent(student.getStudentNumber()));
        assertEquals(0, schoolClass.getStudents().size());
    }

    @Test
    public void given_new_school_when_removing_non_existing_student_then_return_false() {
        var student = School.createStudent();

        assertFalse(schoolClass.removeStudent(student.getStudentNumber()));
    }

    @Test public void given_new_school_when_getting_single_student_then_result_is_added_student() {
        var student = School.createStudent();

        assertTrue(schoolClass.addStudent(student));
        assertEquals(student, schoolClass.getStudent(student.getStudentNumber()));
    }
}
