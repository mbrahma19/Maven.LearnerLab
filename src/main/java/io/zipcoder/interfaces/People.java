package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People<T extends Person> {

    private List<T> personList;

    public People(){
        personList = new ArrayList<T>();
    }

    public People(T[] persons){//TODO: Ask why Arrays.asList(persons) creates an UnsupportedOperationExceptions;
        personList = new ArrayList<T>(Arrays.asList(persons));
    }

    public void add(T person){
        personList.add(person);
    }

    public void remove(T person){
        personList.remove(person);
    }

    public void remove(Long id){
        T person = findById(id);
        remove(person);
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer getCount(){
        return personList.size();
    }

    public T[] getArray(){
        return personList.toArray((T[]) Array.newInstance(personList.getClass().getComponentType(), personList.size()));
    }

    public T findById(Long id){
        T person = null;
        for(T p : personList){
            if(id.equals(p.getId())){
                person = p;
                break;
            }
        }
        return person;
    }

}
