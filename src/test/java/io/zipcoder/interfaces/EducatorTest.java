package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EducatorTest {

    @Before
    public void setup(){
        for (Student s : Students.getInstance().getList()) {
            s.setTotalStudyTime(0.0);
        }
    }

    @Test
    public void testTeach(){
        //given
        Educator teacher = Educator.FROILAN;
        Student learner = Students.getInstance().findById(5l);
        Double expected = 10.0;
        //when
        teacher.teach(learner,10);
        Double actual = learner.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testLecture(){
        //given
        Educator teacher = Educator.NHU;
        Double expected = 10.0;
        //when
        teacher.lecture(Students.getInstance().getArray(),400);
        Double actual = Students.getInstance().findById(15l).getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);
    }
}
