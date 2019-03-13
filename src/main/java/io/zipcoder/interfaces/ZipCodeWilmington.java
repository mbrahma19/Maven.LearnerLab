package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private static ZipCodeWilmington zcw = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance(){
        return zcw;
    }

    private ZipCodeWilmington(){

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = (Learner[]) students.getArray();
        teacher.lecture(learners,numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        instructors.findById(id);

    }
}
