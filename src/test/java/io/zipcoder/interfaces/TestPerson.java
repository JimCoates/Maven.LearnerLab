package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void personConstructorTest(){
        Long expected = 111111L;
        Person person = new Person(111111L);

        Long actual = person.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void personSetNameTest(){
        String expected = "Carl";

        Person person = new Person(111111L);
        person.setName("Carl");

        String actual = person.getName();

        Assert.assertEquals(expected,actual);

    }
}
