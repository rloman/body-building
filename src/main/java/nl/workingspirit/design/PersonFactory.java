package nl.workingspirit.design;

import nl.workingspirit.bodybuilder.model.Person;

import java.time.LocalDate;

public class PersonFactory {

    public Person createPerson(String name, LocalDate dateOfBirth) {
        Person result = new Person();

        return result;

    }
}
