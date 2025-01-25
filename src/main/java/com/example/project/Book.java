package com.example.project;

public class Book{
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;
    
    //initializes the attributes of a Book object to the given parameters
    public Book (String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    //returns the title of the the book
    public String getTitle() {
        return title;
    }
    //sets the title of the book to newTitle
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    //returns the author of the book
    public String getAuthor() {
        return author;
    }
    //sets the author of the book to newAuthor
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
    //returns the publication year of the book
    public int getYearPublished() {
        return yearPublished;
    }
    //sets the publication year of the book to newYearPublished
    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }
    //returns the isbn of the book
    public String getIsbn() {
        return isbn;
    }
    //sets the isbn of the book to newIsbn
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }
    //returns the quantity of the book
    public int getQuantity() {
        return quantity;
    }
    //sets the quantity of the book to newQuantity
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    //returns a string that contains the title, author, publication year, ISBN, and quantity of a specific book
    public String bookInfo() {
        String titleString = "Title: " + title + ", ";
        String authorString = "Author: " + author + ", ";
        String yearString = "Year: " + yearPublished + ", ";
        String isbnString = "ISBN: " + isbn + ", ";
        String quantityString = "Quantity: " + quantity;
        return titleString + authorString + yearString + isbnString + quantityString;
    }
}