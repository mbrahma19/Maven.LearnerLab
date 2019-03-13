package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static Instructors INSTANCE = new Instructors();

    private Instructors(){
    }

    public Instructor[] getArray() {
        return getList().toArray(new Instructor[getList().size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
