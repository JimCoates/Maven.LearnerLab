package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        Students students = Students.getInstance();
        ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
        Double expected = 2.0;
        cohort.hostLecture(Educator.LEON, 80.0);
        Double actual = students.getArray()[1].getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

}