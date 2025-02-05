package FullCourse;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scan.nextLine();

        System.out.printf("Hello %s. How old are you?", name);

        int age = scan.nextInt();
        // scan.nextLine(); CLEANS UP THE INPUT  BUFFER
        System.out.printf("Oh, you're %d. That's great!", age);

        scan.close();
    }
}
