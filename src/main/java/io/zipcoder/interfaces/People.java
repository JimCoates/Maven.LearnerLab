package io.zipcoder.interfaces;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> {

    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public void add(E object){
        this.personList.add(object);
    }

    public E findByID(Long id){
        for (E person: this.personList) {
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    public void removeByPerson(Person person){
        Long id = person.getId();
        removeByID(id);
    }

    public void removeByID(Long id){
        this.personList.remove(findByID(id));
    }

    public Integer getCount(){
        return this.personList.size();
    }

    public abstract E[] getArray();

    public void removeAll(){
     this.personList.clear();
    }
}
