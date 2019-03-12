package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    @Test
    public void constructorTest(){
        //given
        Person[] persons = {new Student(800L),
                new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        //when
        Person[] actual = people.getArray();
        //then
        Assert.assertEquals(persons,actual);
    }

    @Test
    public void testAdd(){
        //given
        Student student = new Student(555l);
        People people = new People();
        Integer expected = 1;
        //when
        people.add(student);
        Integer actual = people.getCount();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        Student student = new Student(800l);
        Person[] persons = {new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        people.add(student);
        //when
        people.remove(student);
        Person actual = people.findById(800l);
        //then
        Assert.assertNull(actual);
    }

    @Test
    public void testRemoveAll(){
        //given
        Person[] persons = {new Student(800l),
                new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        people.removeAll();
        //when
        Person[] actual = people.getArray();
        //then
        Assert.assertEquals(new Person[0],actual);
    }

    @Test
    public void testRemoveById(){
        Student student = new Student(800l);
        Person[] persons = {student,
                new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        //when
        people.remove(800l);
        Person actual = people.findById(800l);
        //then
        Assert.assertNull(actual);
    }

    @Test
    public void testCount(){
        //given
        Person[] persons = {new Student(800L),
                new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        Integer expected = 4;
        //when
        Integer actual = people.getCount();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getArray(){
        //given
        Person[] persons = {new Student(800L),
                new Instructor(900l),
                new Student(600l),
                new Student(500l)};
        People people = new People(persons);
        //when
        Person[] actual = people.getArray();
        //then
        Assert.assertEquals(persons,actual);
    }
}
