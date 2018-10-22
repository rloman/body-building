package nl.workingspirit.bodybuilder.lambdas;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {


    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}
