package FullCourse.OOP;

public class Book {
    private String author;
    private String title;
    private int pageCount;


    public Book( String title,String author, int pageCount){
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String toString(){
        return String.format ("%s by %s", this.title, this.author);
    }
}
