package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People {

    private List<Person> personList;

    public People(){
        personList = new ArrayList<Person>();
    }

    public People(Person[] persons){//TODO: Ask why Arrays.asList(persons) creates an UnsupportedOperationExceptions;
        personList = new ArrayList<Person>(Arrays.asList(persons));
    }

    public void add(Person person){
        personList.add(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(Long id){
        Person person = findById(id);
        remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer getCount(){
        return personList.size();
    }

    public Person[] getArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    public Person findById(Long id){
        Person person = null;
        for(Person p : personList){
            if(id.equals(p.getId())){
                person = p;
                break;
            }
        }
        return person;
    }

}
