package at.ac.htl.bhitm3.Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolTest {
    private School school;

    @Before public void setUp() {
        school = new School();
    }

    @Test public void given_nothing_ensure_school_exists() {
        assertNotNull(school);
    }

    @Test public void given_new_school_when_counting_classes_then_result_is_zero() {
        assertEquals(0, school.getSchoolClasses().size());
    }

    @Test public void given_new_school_when_adding_class_then_result_is_added_class() {
        var schoolClass = School.createSchoolClass();

        assertTrue(school.addSchoolClass(schoolClass));

        assertEquals(1, school.getSchoolClasses().size());
        assertEquals(schoolClass, school.getSchoolClasses().get(0));
    }

    @Test public void given_new_school_add_and_remove_class_when_counting_classes_then_result_is_zero() {
        var schoolClass = School.createSchoolClass();

        assertTrue(school.addSchoolClass(schoolClass));

        assertEquals(1, school.getSchoolClasses().size());
        assertEquals(schoolClass, school.getSchoolClasses().get(0));

        assertTrue(school.removeSchoolClass(schoolClass));
    }

    @Test public void given_new_school_when_counting_teachers_then_result_is_zero() {
        assertEquals(0, school.getTeachers().size());
    }

    @Test public void given_new_school_when_adding_teacher_then_result_is_added_teacher() {
        var teacher = School.createTeacher();

        assertTrue(school.addTeacher(teacher));

        assertEquals(1, school.getTeachers().size());
        assertEquals(teacher, school.getTeachers().get(0));
    }

    @Test public void given_new_school_remove_teacher_when_counting_teachers_then_result_is_zero() {
        var teacher = School.createTeacher();

        assertTrue(school.addTeacher(teacher));

        assertEquals(1, school.getTeachers().size());
        assertEquals(teacher, school.getTeachers().get(0));

        assertTrue(school.removeTeacher(teacher));
    }
}
