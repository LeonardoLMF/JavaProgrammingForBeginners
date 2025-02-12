package FullCourse.OOP;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> book = new ArrayList<Book>();

    public User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName(){
        return this.name;
    }

    public String getBirthday(){
        return this.birthDay.toString();
    }

    public String borrowedBooks(){
        return this.book.toString();
    }


    public void borrow(Book book){
        this.book.add(book);
    }

    public int age(){
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }



}
