package io.zipcoder.interfaces;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learnTest() {
        Student student = new Student(111L);
        Double expected = 20.0;

        student.learn(20.0);
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void implementationTest() {
        Student student = new Student(111L);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void inheritanceTest(){
        Student student = new Student(111L);
        Assert.assertTrue(student instanceof Learner);
    }
}

