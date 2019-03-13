package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    private static Instructors instructors = Instructors.getInstance();

    @Test
    public void getInstructorTest() {
        Instructor actual = Educator.LEON.getInstructor();
        Assert.assertNotNull(actual);
    }

    @Test
    public void teachTest() {
        Student student = new Student(1L);
        Double expected = 4.0;
        Educator.LEON.teach(student,4.0);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lectureTest() {
        Students students = Students.getInstance();
        Double expected = 2.0;
        Educator.LEON.lecture(students.getArray(),80.0);
        Double actual = students.getArray()[1].getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTimeWOrkedTest() {
        Educator.LEON.setTimeWOrked(100.0);
        Double expected = 100.0;
        Double actual = Educator.LEON.getTimeWorked();

        Assert.assertEquals(expected,actual);

    }
}