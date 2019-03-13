package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

final class Students extends People<Student> {

    final static Students instance = new Students();

    public static Students getInstance() {
        return instance;
    }

    private Students() {
        for (Long i = 0L; i < 40; i++) {
            personList.add(new Student(i));
        }
    }

    public Student[] getArray(){
        return this.personList.toArray(new Student[personList.size()]);
    }

    public void remove(Person person){
        personList.remove(person);
    }
}
