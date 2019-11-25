package com.emergon.restapijersey;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anastasios
 */
public class PersonService {

    private static List<Person> list;

    public List<Person> findAll() {
        if (list == null) {
            list = new ArrayList<>();
            list.add(new Person("Nick", 12));
            list.add(new Person("Peter", 20));
            list.add(new Person("Mary", 15));
        }
        return list;
    }

    public Person getPerson(int id) {
        return list.get(id);
    }

    public void addPerson(Person p) {
        list.add(p);
    }

    public void updatePerson(int id, Person p) {
        list.set(id, p);
    }

    public void deletePerson(int id) {
        list.remove(id);
    }

}
