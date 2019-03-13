package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    LEON (new Instructor(1L)),
    WILL(new Instructor(2L)),
    FROILAN(new Instructor(3L)),
    DOLIO(new Instructor(4L));



    private final Instructor instructor;



    private double timeWorked = 0;

    Educator(Instructor instructor){
        this.instructor = instructor;

    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }

    public void setTimeWOrked(Double timeWorked){
    this.timeWorked += timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}

