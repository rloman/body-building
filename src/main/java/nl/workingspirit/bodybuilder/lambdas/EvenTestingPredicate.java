package nl.workingspirit.bodybuilder.lambdas;

import java.util.function.Predicate;

public class EvenTestingPredicate implements Predicate<Integer> {


    @Override
    public boolean test(Integer value) {
        return value % 2 == 0;
    }
}
