package FullCourse;

public class LogicalOperators {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 20;

        System.out.println(number1 > 5 && number1 < 15); // logical AND
        System.out.println(number2 < 15 || number2 > 20); // logical OR
        System.out.println (!(number2 < 15 && number2 > 20)); // logical NOT
    }
}
