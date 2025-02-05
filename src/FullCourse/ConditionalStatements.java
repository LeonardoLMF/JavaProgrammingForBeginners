package FullCourse;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter the second number: ");
        double secondNumber = scan.nextDouble();
        scan.nextLine();

        System.out.println("What operator do you want to perform? ");
        String operation = scan.nextLine();

        if (operation.equalsIgnoreCase("sum")){
            System.out.printf("The sum of %f and %f is: %f", firstNumber, firstNumber, firstNumber + secondNumber);
        } else if (operation.equalsIgnoreCase("sub")) {
            System.out.printf("The sub of %f and %f is: %f", firstNumber, firstNumber, firstNumber - secondNumber);
        } else if (operation.equalsIgnoreCase("mul")) {
            System.out.printf("The mul of %f and %f is: %f", firstNumber, firstNumber, firstNumber * secondNumber);
        } else if (operation.equalsIgnoreCase("div")) {
            if (secondNumber == 0){
                System.out.println("Can not divide by 0");
            } else {
                System.out.printf("The div of %f and %f is: %f", firstNumber, firstNumber, firstNumber / secondNumber);
            }
        } else {
            System.out.println("This operation doesn't exist!");
        }
        scan.close();

    }
}
