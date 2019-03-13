package io.zipcoder.interfaces;

public final class Students extends People {

    private static Students INSTANCE = new Students();

    private Students(){
        for(long i = 0l; i < 40l ; i++){
            Student student = new Student(i+1);
            add(student);
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
