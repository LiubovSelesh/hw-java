package com.company;

public class Main {

    public static void main(String[] args) {
// 2.Make class Book. It should contain two fields: author and title.
// The author is a Class with the following field firstName, lastName, yearOfBirth.
// Implement the method of printing the Book
        Author author1 = new Author();

        author1.firstName = "Erich Maria";
        author1.lastName = "Remarque";
        author1.yearOfBirth = 1898;


        Author author2 = new Author();
        author2.firstName = "Ernest ";
        author2.lastName = "Hemingway";
        author2.yearOfBirth = 1899;

        Book book1 = new Book();
        book1.author = author1;
        book1.title = "\"Arch of Triumph\"";

        Book book2 = new Book();
        book2.author = author1;
        book2.title = "\"The Old Man and the Sea\"";
        printBook(book1);
        printBook(book2);


    }

    public static void printBook(Book book) {
        System.out.println("Author: " + book.author.firstName + " " + book.author.lastName + ". " +  "He was born in " + book.author.yearOfBirth + "." + "He wrote a book " +  book.title);
        System.out.println();
    }

}



