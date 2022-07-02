package com.company;
        /*
        you have to implement a library using java class library
        methods: addBook, issueBook, returnBook, showAvailableBooks
        properties: array to store the available books,
        array to store the issued books
        */

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("available books are");
        for (String book: this.books){
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    void issueBook(String book){
            for(int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("the book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist!...");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class cwh_50_exercise4_online_library {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("think and grow rich");
        centralLibrary.addBook("algorithms");
        centralLibrary.addBook("c++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("c++");
        centralLibrary.showAvailableBooks();
    }
}
