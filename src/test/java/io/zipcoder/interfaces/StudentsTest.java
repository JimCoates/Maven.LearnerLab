package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void nullaryConstructorTest(){
        Students student = Students.getInstance();
        Integer expected = 42;

        Integer actual = student.personList.size();

        Assert.assertEquals(expected,actual);
    }
}
