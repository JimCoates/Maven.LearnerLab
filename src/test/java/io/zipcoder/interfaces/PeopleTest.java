package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    public Students studentsSingle;
    public Student student;

    @Before
    public void setup(){
        studentsSingle = Students.getInstance();
        student = new Student(222L);
    }

    @Test
    public void add() {
        studentsSingle.add(student);
        Assert.assertNotNull(studentsSingle.findByID(222L));
    }

    @Test
    public void findByID() {
        studentsSingle.add(student);
        Person expected = student;
        Person actual = studentsSingle.findByID(222L);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeByPerson() {
        studentsSingle.add(student);
        studentsSingle.remove(student);
        Assert.assertNull(studentsSingle.findByID(222L));
    }

    @Test
    public void removeByID() {
        studentsSingle.add(student);
        studentsSingle.removeByID(222L);
        Assert.assertNull(studentsSingle.findByID(222L));
    }
}