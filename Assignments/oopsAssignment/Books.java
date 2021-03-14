package oopsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Books{
    public String isbn;
    public boolean isRented;
    public String author;
    public String department;
    public static List<Books> bookList=new ArrayList<>();
    public static int countOfRentedBooks;

    public Books(){
        this.department="Arts";
        this.isbn="ab12";
        this.isRented=false;
        this.author="Amar";
        bookList.add(this);
    }
    public Books(String department,String isbn,boolean isRented, String author){
        this.department=department;
        this.isbn=isbn;
        this.isRented=isRented;
        this.author=author;
        bookList.add(this);
    }

}
