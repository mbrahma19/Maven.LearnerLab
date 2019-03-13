package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void constructorTest(){
        //given
        Instructors instructors = Instructors.getInstance();
        Integer expected = 5;
        //when
        Integer actual = instructors.getCount();
        //then
        Assert.assertEquals(expected,actual);
    }
}
