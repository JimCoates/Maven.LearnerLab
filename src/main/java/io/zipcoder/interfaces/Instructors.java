package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor> {
    private static Instructors instance = new Instructors();


    public static Instructors getInstance() {
        return instance;
    }

    private Instructors() {
        personList.add(Educator.LEON.getInstructor());
        personList.add(Educator.DOLIO.getInstructor());
        personList.add(Educator.WILL.getInstructor());
        personList.add(Educator.FROILAN.getInstructor());
        }

    public Instructor[] getArray(){
        return this.personList.toArray(new Instructor[personList.size()]);
    }
}
