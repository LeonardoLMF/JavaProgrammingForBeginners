package FullCourse.OOP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = new User("Leo", "2002-04-27");

        Book rssCrazy = new Book("RssCrazy", "Rai", 2  );

        AudioBook dracula = new AudioBook("Dracula", "Bral", 30000);

        Ebook hp = new Ebook("Harry Potter", "Me", 192, "PDF");
        System.out.println(hp.toString());



//        user.borrow(rssCrazy);
//        System.out.printf("%s was born in %s and he is now %d years old. \n",
//                user.getName(), user.getBirthday(), user.age());
//        System.out.printf("%s has borrowed these books %s \n",
//                user.getName(), user.borrowedBooks());
    }
}
