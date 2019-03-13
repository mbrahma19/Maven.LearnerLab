package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    DOLIO,
    LEON,
    WILHELM,
    KRIS,
    FROILAN,
    NHU;

    private final Instructor instructor;


    Educator() {
        this.instructor = new Instructor(ordinal()) {
            private Double numberOfHoursWorked = 0.0;

            @Override
            public void teach(Learner learner, double numberOfhours) {
                learner.learn(numberOfhours);
                numberOfHoursWorked+=numberOfhours;
            }

            public Double getHoursWorked(){
                return numberOfHoursWorked;
            }
        };
        Instructors.getInstance().add(instructor);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }

}
