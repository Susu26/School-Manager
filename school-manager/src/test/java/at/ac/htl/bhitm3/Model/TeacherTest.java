package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeacherTest {
    Teacher teacher;
    @Before public void setUp() {
        teacher = School.createTeacher();
    }

    @Test
    public void given_teacher_is_instance_of_person() {
        assertTrue(teacher instanceof Person);
    }

    @Test public void given_teacher_has_salary() {
        assertEquals(0.0, teacher.getSalary(), 0.001);
    }

    @Test public void given_teacher_set_salary_is_get_salary() {
        final double SALARY = 3000.3;

        teacher.setSalary(SALARY);
        assertEquals(SALARY, teacher.getSalary(), 0.001);
    }
}
