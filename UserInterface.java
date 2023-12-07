package com.example.library;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * This class represents the user interface for the Library Management System.
 * It provides various options for the user to interact with the library, such as
 * adding, removing, and listing books.
 */
public class UserInterface {
    private Library library;

    /**
     * Constructs a UserInterface for a given Library.
     * @param library The library instance this UserInterface will interact with.
     */
    public UserInterface(Library library){
        this.library=library;
    }
    private Iterable<? extends Object> book;
    private Iterable<? extends Object> Books;

    /**
     * Displays the main menu of the Library Management System.
     */
    public void displayMenu() {
        // existing implementation
        out.println("Library Management System Menu");
        out.println("1. Add a Book");
        out.println("2. Remove a Book");
        out.println("3. List All Books");
        out.println("4. Quit");
    }

    /**
     * Runs the main loop of the user interface, allowing the user to make choices and interact with the library.
     */
    public void run() {
        // existing implementation
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            out.print("Enter your choice:");
            choice = scanner.nextInt();
            //Consume the newline
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    listAllBooks();
                case 4:
                    out.println("Exiting the program.");
                    break;
                default:
                    out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }

    /**
     * Handles the addition of a new book to the library.
     */
    public void addBook() {
        // existing implementation
        Scanner scanner = new Scanner(System.in);
        out.print("Enter the book ID:");
        scanner.nextLine();//Consume the newline
        out.print("Enter the book title:");
        scanner.nextLine();
        Book Book;
        Book = new Book();
        Objects.requireNonNull(library).addbook(Book);
        out.println("Book added successfully.");
    }

    /**
     * Handles the removal of a book from the library based on its ID.
     */
    public void removeBook() {
        // existing implementation
        Scanner scanner = new Scanner(System.in);
        out.print("Enter the book ID to remove:");
        int id;
        id = scanner.nextInt();
        list<Book> books;
        books = (list<Book>) Objects.requireNonNull(library).listallbooks();
        for (Object Books : Books) {
            library.removeBook(id);
            out.println("Book removed successfully.");
            break;
        }
        out.println("Book with ID" + id + "not found");
    }

    /**
     * Lists all the books currently in the library.
     */
    public void listAllBooks() {
        // existing implementation
        list<Book> books = (list<com.example.library.Book>) (list<com.example.library.Book>) Objects.requireNonNull(library).listallbooks();
        if (((List<?>) books).isEmpty()) out.println("No books in the library.");
        else {
            out.println("List of Books:");
            for (Object Book : book) {
                out.println("ID:" + book.getClass() + ",Title:" + book.getClass() + ",Author" + book.getClass());
            }
        }
    }

    /**
     * Inner class to support listing of books.
     * This class is currently empty and needs implementation.
     * @param <T> The type of elements in the list.
     */
    class list<T> {
        // implementation needed
    }
}