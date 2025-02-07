package FullCourse;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        char vowels[] = {'a', 'o', 'i', 'u', 'e'};
        Arrays.sort(vowels);
        char key = 'e';
        int startingIndex = 1;
        int endingIndex = 4;

        int foundItemIndex = Arrays.binarySearch(vowels,startingIndex,endingIndex, key);
        // Preencher
        //  Arrays.fill(vowels, startingIndex, endingIndex, 'x');
        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);

        //numbers
        int[] numbers = {1,3,2,4,6};
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);

        System.out.println(numbers == copyOfNumbers);
        System.out.println(Arrays.equals(numbers, copyOfNumbers));

    }
}
