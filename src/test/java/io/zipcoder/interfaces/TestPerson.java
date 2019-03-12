package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        //given
        long expected = 34l;
        //when
        Person person = new Person(expected);
        long actual = person.getId();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName(){
        //given
        String expected = "Marci";
        Person person = new Person(34l);
        //when
        person.setName(expected);
        String actual = person.getName();
        //then
        Assert.assertEquals(expected,actual);
    }



}
