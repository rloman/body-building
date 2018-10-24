package nl.workingspirit.bodybuilder.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestingPredicateDemo {

    public static void main(String[] args) {
        testIt(4, new EvenTestingPredicate());
        testIt(5, new OddTestingPredicate());

        testIt(7, new Predicate<Integer>() {

            @Override
            public boolean test(Integer value) {
                return value > 15;
            }
        });

        testIt(16, new Predicate<Integer>() {

            @Override
            public boolean test(Integer value) {
                return value > 15;
            }
        });

        testIt(17, n -> n > 20);
        testIt(21, n -> n > 20);


        Predicate<Integer> largeNumberPredicate = n -> n > 1000;

        testIt(10000, largeNumberPredicate);

        BiFunction<Integer, Integer, Integer> square = (n, m) -> {
            System.out.println(n);
            return n * m;
        };



    }

    public static void testIt(int value, Predicate<Integer> predicate) {
        // buiten OCP om (in OCA)
        if(predicate.test(value)){
            System.out.println(value +" is true");
        }
        else {
            System.out.println(value + " is false");
        }
    }


}
