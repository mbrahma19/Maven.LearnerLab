package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void constructorTest(){
        //given
        Students students = Students.getInstance();
        Integer expected = 40;
        //when
        Integer actual = students.getCount();
        //then
        Assert.assertEquals(expected,actual);
    }


}
