package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static Instructors INSTANCE = new Instructors();

    private Instructors(){
        for(long i = 0l; i < 5l ; i++){
            Instructor instructor = new Instructor(i+1);
            add(instructor);
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
