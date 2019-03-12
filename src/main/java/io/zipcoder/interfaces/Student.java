package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    Double totalStudyTime;

    public Student(Long id) {
        super(id);
        this.totalStudyTime = 0.0;
    }


    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
