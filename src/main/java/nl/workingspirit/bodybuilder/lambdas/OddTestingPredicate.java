package nl.workingspirit.bodybuilder.lambdas;

import java.util.function.Predicate;

public class OddTestingPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        return value % 2 != 0;
    }
}
