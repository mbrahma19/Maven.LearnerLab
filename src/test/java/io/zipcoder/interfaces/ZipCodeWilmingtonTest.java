package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Before
    public void setup(){
        for (Student s : Students.getInstance().getList()) {
            s.setTotalStudyTime(0.0);
        }
    }

    @Test
    public void hostLecture(){
        //given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Double expected = 10.0;
        //when
        zcw.hostLecture(new Instructor(900l),400);
        Double actual = students.findById(30l).getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hostLectureById(){
        //given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Double expected = 10.0;
        //when
        zcw.hostLecture(5l,400);
        Double actual = students.findById(30l).getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);

    }

}
