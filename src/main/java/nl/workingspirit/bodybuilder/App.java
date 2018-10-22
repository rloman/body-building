package nl.workingspirit.bodybuilder;

import nl.workingspirit.bodybuilder.model.Person;
import nl.workingspirit.design.Singleton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        bar(numbers);

        String firstName = "Javiel";

        System.out.println(Math.PI);

        Person piet = new Person();
        piet.setDateOfBirth(LocalDate.of(1968, 9, 8));

        Singleton s = Singleton.getInstance();
    }

    public static void bar(List numbersList) {

    }
}




