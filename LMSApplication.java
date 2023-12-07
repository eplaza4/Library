package com.example.library;

import java.util.Scanner;

/**
 * The LMSApplication class serves as an entry point for the Library Management System (LMS).
 * This application allows users to interact with a library system to add, remove, check out.
 * and check in books. It uses a command-line interface for user interactions.
 */
public class LMSApplication {
    /**
     * Main method which serves as an entry point for the Library Management System.
     * It provides a command-line interface for managing a library's collection of books.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Library library=new Library();
      // existing implementation

        Library.printDatabase();
        // Ask the user for a barcode to remove

        System.out.print("Enter a barcode to remove:");
        String barcodeToRemove=scanner.nextLine();
        Library.removeBookByBarcode(barcodeToRemove);
        Library.printDatabase();
        //Ask the user for a title to remove

        System.out.print("Enter a title to remove:");
        String titleToRemove = scanner.nextLine();
        Library.removeBookByTitle(titleToRemove);
        Library.printDatabase();
        //Ask the user for a title to check out

        System.out.print("Enter a title to check out:");
        String titleToCheckout=scanner.nextLine();
        Library.checkoutBook(titleToCheckout);
        Library.printDatabase();
        //Ask the user for a title to check in

        System.out.print("Enter a title to check in:");
        String titleToCheckin=scanner.nextLine();
        Library.checkinBook(titleToCheckin);
        Library.printDatabase();

        scanner.close();
    }
}