package com.kodilla.collections.adv.immutable.special.homework;

import static com.kodilla.collections.adv.immutable.special.homework.BookManager.books;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Neverwhere", "Neil Gaiman");
        Book book2 = bookManager.createBook("Dune", "Frank Herbert");
        Book book3 = bookManager.createBook("Kłamca", "Jakub Ćwiek");
        Book book4 = bookManager.createBook("Neverwhere", "Neil Gaiman");
        Book book5 = bookManager.createBook("Dune", "Frank Herbert");


        if (book1 == book4) {
            System.out.println("I've got this " + book1);
        } else {
            System.out.println("I didn't have this " + book1);
        }

        if (book1.equals(book4)) {
            System.out.println("I've got this " + book1);
        } else {
            System.out.println("I didn't have this " + book1);
        }
    }
}
