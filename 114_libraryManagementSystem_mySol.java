/*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
*/

package com.company;

import java.util.ArrayList;

class MyBook{
    public String book,author;
    public MyBook(String book, String author){
        this.book = book;
        this.author = author;
    }

    @Override
    public String toString(){
        return "(Name:  " + book + ", Author: "+author+")";
    }
}

class StudentLibrary{
    ArrayList<MyBook> books;
    public StudentLibrary(ArrayList<MyBook> books){
        this.books = books;
    }

    public void showAvailableBooks(){
        System.out.println(this.books);
    }

    public void addBooks(MyBook book){
        this.books.add(book);
        System.out.println(book+" Has Been Added!");
    }

    public void issueBook(MyBook book, String issued_to){
        this.books.remove(book);
        System.out.println(book+" Has been removed! and issued to: "+ issued_to);
    }

    public void returnBook(MyBook book){
        this.books.add(book);
        System.out.println(book+" Has been returned!");
    }
}

public class cwh_114_libraryManagementSystem_mySol {
    public static void main(String[] args) {
        ArrayList<MyBook> bk = new ArrayList<>();
        MyBook b1 = new MyBook("book1","auth1");
        bk.add(b1);

        MyBook b2 = new MyBook("book2","auth2");
        bk.add(b2);

        MyBook b3 = new MyBook("book3","auth3");
        bk.add(b3);

        MyBook b4 = new MyBook("book4","auth4");
        bk.add(b4);

        StudentLibrary l = new StudentLibrary(bk);
        l.showAvailableBooks();
        l.issueBook(b4,"ash");
        l.showAvailableBooks();
        l.returnBook(b4);
        l.showAvailableBooks();
    }
}
