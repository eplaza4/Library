package com.example.library;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract class represents a library database and provides methods
 * to interact with the database. It demonstrates basic database operations
 * like querying and deleting records.
 */
public abstract class LibraryDatabase {

    /**
     * Main method to execute database operations.
     * Demonstrates the usage of JDBC class to interact with the database.
     * It retrieves, prints, deletes, and again prints data from the database.
     * @param args Command line arguments (not used in this method).
     */

    public static void main( String[] args ) {
        try {
        JDBC db1 = new JDBC();
        ArrayList<ArrayList<Object>> data = db1.getExecuteResult("select * from book;");
        if (data != null) {
            printDatabase(data);
        } else {
            System.out.println("No data retrieved from the database.");
        }

        db1.delete("first_name", "last_name");
        System.out.println("Deleted");

        data = db1.getExecuteResult("select * from book;");
        if (data != null) {
            System.out.println("\nHere is the contents of the database:\n");
            printDatabase(data);
        } else {
            System.out.println("No data retrieved from the database after delete.");
        }
    } catch(Exception e) {
        e.printStackTrace();
    }
}

    /**
     * Prints the contents of the database.
     * Iterates over each record in the database and prints it.
     * @param data The data to be printed, structured as an Arraylist of Arraylists.
     */
    private static void printDatabase( ArrayList<ArrayList<Object>> data ) {
        for (List<Object> record : data) {
            System.out.println(record.toString());
        }
    }
}