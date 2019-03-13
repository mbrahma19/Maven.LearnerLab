package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private static ZipCodeWilmington zcw = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance(){
        return zcw;
    }

    private ZipCodeWilmington(){}

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getArray(),numberOfHours);
    }

}
