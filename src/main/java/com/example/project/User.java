package com.example.project;

public class User{
    private String name;
    private String Id;
    private Book[] books = new Book[5];
    //initializes name and id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    } 
    // returns the name of the user
    public String getName() {
        return name;
    }
    //sets the name of the user to newName
    public void setName(String newName) {
        name = newName;
    }
    //returns the id of the user
    public String getId() {
        return Id;
    }
    //sets the id of the user to newId
    public void setId(String newId) {
        Id = newId;
    }
    //returns each book of the books array
    public Book[] getBooks() {
        return books;
    }
    //sets the books array to a book array called newBooks
    public void setBooks(Book[] newBooks) {
        books = newBooks;
    }
    //returns a string containing a list of the info of the books owned by the user
    //if a book in the user's book list is null, the String states that it is "empty" instead
    public String bookListInfo() {
        String returnString = "";
        for (Book book : books) {
            if (book == null) {
                returnString += "empty\n";
            } else {
                returnString += book.bookInfo() + "\n";
            }
        }
        return returnString;
    }
    //returns a string containing the user's name, ID, and list of books
    public String userInfo() {
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }
}