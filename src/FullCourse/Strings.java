package FullCourse;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Leonardo";
        String lastName = "Luiz";
        int age = 22;

        //alguns metodos de String
        System.out.println(name);
        System.out.println("O tamanho da String é: " + name.length());
        System.out.println(name.toUpperCase());
        System.out.println("Meu nome é: " + name + " e eu tenho " + age + " anos");
        System.out.println(name.concat(lastName));
        System.out.println(name.replace("Leonardo", "Leo"));
        System.out.println(name.contains("Leo"));

        //formatacao
        String formattedString = String.format("My name is %s. My last name is %s. I'm %d years old", name, lastName, age);
        System.out.println(formattedString);

        //criação de um objeto String
        String string = new String("abc");
        String string2 = new String("ABC");
        System.out.println(string.equals(string2));
        System.out.println(string.equalsIgnoreCase(string2));

    }
}
