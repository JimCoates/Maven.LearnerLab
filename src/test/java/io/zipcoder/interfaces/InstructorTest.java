package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void ImplementationTest(){
        Instructor instructor = new Instructor(111L);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void InheritanceTest(){
        Instructor instructor = new Instructor(111L);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Student student = new Student(111L);
        Instructor instructor = new Instructor(112L);
        Double expected = 2.0;

        instructor.teach(student,2.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void lectureTest() {
        Student student = new Student(1L);
        Student student1 = new Student(2L);
        Instructor instructor = new Instructor(3L);
        Double expected = 2.0;

        Learner[] array = new Learner[2];
        array[0] = student;
        array[1] = student1;

        instructor.lecture(array,4.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }
}