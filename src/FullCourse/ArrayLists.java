package FullCourse;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        numbers.add(4);
        numbers.add(2);

        System.out.println("Before: " + numbers.toString());

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 3);
        });

        System.out.println("After: " + numbers.toString());
    }
}
