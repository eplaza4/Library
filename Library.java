package com.example.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a library which manages a collection of books
 * Provides functionality to add, remove, check out, and check in books.
 * as well as printing the current list of books.
 */
public class Library {
    private static List<Book> books = null;
    private static Iterator<Book> iterator;

    /**
     * Constructs a new Library instance with an empty list of books.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Remove a book from the library based on its barcode.
     * @param barcode The barcode of the book to be removed.
     */
    public static void removeBookByBarcode( String barcode ) {
        // existing implementation
        boolean finished = false;
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBarcode().equals(barcode)) {
                iterator.remove();
                System.out.println("Book with barcode" + barcode + "removed");
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found within the given barcode.");
        }
    }

    /**
     * Removes a book from the library based on its title.
     * The method iterates through the list of books and removes the first
     * book that matches the given title.
     * @param title The title of the book to be removed.
     */
    public static void removeBookByTitle( String title ) {
        // existing implementation
        Iterator Book;iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Book with title" + title + "removed.");
                return;
            }
        }
        System.out.println("No book found with the given title.");
    }

    /**
     * Checks out a book based on its title. Marks the book as checked out.
     * @param title The title of the book to be checked out.
     */
    public static void checkoutBook( String title ) {
        // existing implementation
        boolean finished = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isCheckedOut()) {
                    book.setCheckedOut(true);
                    System.out.println("Book checked out:" + book);
                } else {
                    System.out.println("Book is already checked out.");
                }
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found with the given title.");
        }
    }

    /**
     * Checks in a book based on its title. Marks the book as not checked out.
     * @param title The title of the book to be checked in.
     */
    public static void checkinBook( String title ) {
        // existing implementation
        boolean finished = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isCheckedOut()) {
                    book.setCheckedOut(false);
                    System.out.println("Book checked in:" + book);
                } else {
                    System.out.println("Book is not checked out.");
                }
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found with the given title.");
        }
    }

    /**
     * Prints the current lists of books in the library.
     */
    public static void printDatabase() {
        // existing implementation
        System.out.println("Printing database...");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addbook( Book book ) {
        this.books.add(book);
    }

    /**
     * Lists all books currently in the library.
     * @return An object representing the list of all books (to be implemented).
     */
    public Object listallbooks() {
        final Object o = null;
        return o;
    }

    /**
     * Removes a book from the library based on its ID.
     * @param id The ID of the book to be removed.
     */
    public void removeBook( int id ) {
        // implementation needed
    }
}