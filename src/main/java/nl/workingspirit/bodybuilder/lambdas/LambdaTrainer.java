package nl.workingspirit.bodybuilder.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class LambdaTrainer {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(0, 1,1,2,3,5,8,13,21,34,55,89);

        numberList.stream().filter(n -> n % 2 == 0).forEach(n -> {
            System.out.println(n);
        });


        System.out.println("End now the squares");
        numberList.stream()
                .distinct()
                .filter(new EvenTestingPredicate())
                .map(n -> n * n)
                .forEach(System.out::println);

        numberList.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 0)
                .map(n -> new Random().nextInt(n))
                .peek(n -> System.out.println(n))
                .forEach(System.out::println);

        numberList.stream().filter(n -> n > 15)
        .peek(n -> System.out.println("Dit mag je niet zien: "+n));

    }
}
