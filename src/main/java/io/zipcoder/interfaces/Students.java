package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static Students INSTANCE = new Students();

    private Students(){
        for(long i = 0l; i < 40l ; i++){
            Student student = new Student(i+1);
            add(student);
        }
    }

    public Student[] getArray() {
        return getList().toArray(new Student[getList().size()]);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
