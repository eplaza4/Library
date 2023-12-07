package com.example.library;

/**
 * This class represents a book in the library system
 * It contains information about the book such as its title, author, and barcode.
 * Additionally, it tracks whether the book is currently checked out.
 */
public class Book {
    /** The title of the book.*/
    public String title;
    /** The author of the book.*/
    public String author;
    /** The unique barcode identifier for the book.*/
    public String barcode;
    /** Indicates whether the book is currently checked out or not.*/
    public boolean isCheckedOut;

    /**
     * Creates a new book with the specified title, author, and barcode.
     * Initially, the book is not checked out.
     * @param title The title of the book, must not be null or empty.
     * @param author The author of the book, must not be null or empty.
     * @param barcode The unique barcode of the book, must not be null or empty.
     * @throws IllegalArgumentException if title, author, or barcode is null or empty.
     */
    public Book(String title, String author, String barcode){
        if (title==null || title.isEmpty() || author==null || author.isEmpty() || barcode==null || barcode.isEmpty()){
            throw new IllegalArgumentException("Title, author, and barcode must not be null or empty.");
        }
        this.title=title;
        this.author=author;
        this.barcode=barcode;
        this.isCheckedOut=false;
    }

    /**
     * Default constructor for creating a book instance without setting properties initially.
     */
    public Book() {
        
    }

    /**
     * Returns the title of the book.
     * @return the title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Return the barcode of the book.
     * @return the barcode of the book.
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Checks if the book is currently checked out.
     * @return True if the book is checked out, false otherwise.
     */
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    /**
     * Sets the checked out status of the book.
     * @param checkedOut The new checked out status of the book.
     */
    public void setCheckedOut( boolean checkedOut ) {
        isCheckedOut = checkedOut;
    }

    /**
     * Returns a string representation of the book, including its title, author, barcode, and checked out status.
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ",author='" + author + '\'' + ",barcode='" + barcode + '\'' + ",isCheckedOut=" + isCheckedOut + '}';
    }
}