package com.example.project;

public class BookStore{
    private Book[] books = new Book[5]; //limit of 5 books
    private User[] users = new User[10]; //limit of 10 users
    //empty constructor
    public BookStore() {}
    //returns the array of users of the BookStore
    public User[] getUsers() {
        return users;
    }
    //sets the array of users of the BookStore to newUsers
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }
    //returns the array of books of the BookStore
    public Book[] getBooks() {
        return books;
    }
    //assigns a new User "user" to leftmost index of the array "users" that has a null value
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }
    //searches the array "users" for the User given in the parameter and sets the index of that user to null
    //afterwards, it calls on the consolidateUsers() method to set the users array to have all users at the leftmost side
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
            }
        }
        consolidateUsers();
    }
    //sets the users array to have all User objects at the left most side, followed by null values for the rest of the length of the array
    public void consolidateUsers() {
        User[] tempUsers = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                tempUsers[index] = users[i];
                index++;
            }
        }
        users = tempUsers;
    }
    //assigns Book "book" to the leftmost side of the books array that has a null value
    public void addBook(Book book) {
        boolean bookAdded = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null && bookAdded == false) {
                books[i] = book;
                bookAdded = true;
            }
        }
    }
    //sets the books array to have the Book "book", given in the parameter to the given index, shifting all books past the index to the right
    public void insertBook(Book book, int index) {
            Book[] tempBooks = new Book[books.length + 1]; //longer array to prevent OutOfBoundsException
            for (int i = 0; i < books.length; i++) {
                if (i < index) { //adds all values before the insert index to the array
                    tempBooks[i] = books[i];
                } else if (i == index) { //adds the book at the specified index and moves the book orignially at that index right one
                    Book replacedBook = books[i];
                    tempBooks[i] = book;
                    tempBooks[i + 1] = replacedBook;
                } else { //adds the rest of the books past the index
                    tempBooks[i + 1] = books[i];
                }
            }
            for (int i = 0; i < books.length; i++) { //changes books array to contain the new tempBooks array without the null values at the end
                books[i] = tempBooks[i];
            }
    }
    //removes one copy of the Book given in the parameter from the books array by taking one away from its quantity
    //if there were to be no copies of a book left, it would be removed from the books array
    //the length of the books array is updated after the null value is removed by using the conslidateBooks() method
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity() - 1);
                if (books[i].getQuantity() == 0) {
                    books[i] = null;
                    consolidateBooks();
                }
            }
        }
    }
    //sets the books array to the a new instance of an array in which all null values are removed from the original books array
    public void consolidateBooks() {
        int bookCount = 0;
        for (Book book : books) {
            if (book != null) {
                bookCount++;
            }
        }
        Book[] tempBooks = new Book[bookCount];
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                tempBooks[index] = books[i];
                index++;
            }
        }
        books = tempBooks;       
    }
    //returns a string containing the book info of each book in the books array; returns empty if the book is null(testing purposes)
    public String bookStoreBookInfo() {
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
}