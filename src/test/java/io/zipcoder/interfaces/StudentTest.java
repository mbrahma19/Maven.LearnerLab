package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(900l);
        //when
        Boolean result = student instanceof Learner;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testInheritance(){
        //given
        Student student = new Student(900l);
        //when
        Boolean result = student instanceof Person;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testLearn(){
        //given
        Student student = new Student(980l);
        Double expected = 40.0;
        //when
        student.learn(expected);
        Double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);
    }
}
