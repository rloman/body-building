package nl.workingspirit.bodybuilder.loops;

import java.util.Arrays;
import java.util.List;

public class EnhancedForApplication {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0,1,1,2,3,5,8,13, 21,34,55);

        System.out.println("size:"+numberList.size());

        // Basic loop
        int index = 0;
        for(index = 0;index < numberList.size();index++) {
            System.out.println(numberList.get(index));
        }

        System.out.println(index);

        // Enhanced for
        for(int element: numberList) {
            System.out.println(element);
        }

        numberList.forEach(n -> {
            System.out.println(n);
        });

    }
}
