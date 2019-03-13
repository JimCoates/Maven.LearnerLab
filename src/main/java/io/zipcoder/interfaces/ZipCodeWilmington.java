package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();
    private static ZipCodeWilmington ourInstance = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Educator educator, Double numberOfHours){
       educator.lecture(students.getArray(),numberOfHours);
       educator.setTimeWOrked(numberOfHours);
    }

}

