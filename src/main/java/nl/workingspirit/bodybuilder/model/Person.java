package nl.workingspirit.bodybuilder.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;

    private static int personCounter =-30;

    static {
        System.out.println("Set counter to 0");
        personCounter = 0;
    }


    static {
        System.out.println("Initialised the Person class");
    }

    {
        System.out.println("Set name to onbekend");
        this.name = "onbekend";
    }

    {
        this.dateOfBirth = LocalDate.of(0,1,1);
        System.out.println("setting date to 0");
    }

    public Person() {
        System.out.println("Daarna dus de constructor");
        Person.personCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
