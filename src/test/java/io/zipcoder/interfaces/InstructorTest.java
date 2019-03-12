package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(900l);
        //when
        Boolean result = instructor instanceof Teacher;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(900l);
        //when
        Boolean result = instructor instanceof Person;
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(900l);
        Student student = new Student(100l);
        Double expected = 40.0;
        //when
        instructor.teach(student,expected);
        Double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(980l);
        Student student = new Student(100l);
        Student student1 = new Student(200l);
        Student student2 = new Student(300l);
        Student student3 = new Student(400l);
        Student[] students = {student,student1,student2,student3};
        Double hoursOfLecture = 400.0;
        Double expected = 100.0;
        //when
        instructor.lecture(students,hoursOfLecture);
        Double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expected,actual);
    }
}
