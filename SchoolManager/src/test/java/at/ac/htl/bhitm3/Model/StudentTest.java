package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    @Before public void setup() {
        student = School.createStudent();
    }

    @Test public void given_student_is_instance_of_person() {
        assertTrue(student instanceof Person);
    }

    @Test public void given_student_when_get_student_number_result_is_distinct_and_not_0() {
        Student newStudent = School.createStudent();

        assertNotEquals(0, student.getStudentNumber());
        assertNotEquals(0, newStudent.getStudentNumber());

        assertNotEquals(student.getStudentNumber(), newStudent.getStudentNumber());
    }
//    @Test public void given_student_has_valid_fields_when_to_string_result_valid() {
//    }
}
