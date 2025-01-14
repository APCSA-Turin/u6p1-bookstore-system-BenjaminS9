package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5];
    private User[] users = new User[10];
    //requires 1 empty constructor
    public BookStore() {}
    // public getUsers(){}
    public User[] getUsers() {
        return users;
    }
    // public setUsers(){}
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }
    // public  getBooks(){}
    public Book[] getBooks() {
        return books;
    }
    // public void addUser(User user){} 
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }
    // public void removeUser(User user){}
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
            }
        }
        consolidateUsers();
    }
    // public void consolidateUsers(){}
    public void consolidateUsers() {
        User[] tempUsers = new User[10];
        int idx = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                tempUsers[idx] = users[i];
                idx++;
            }
        }
        users = tempUsers;
    }
    // public void addBook(Book book){}
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i] = book;
                break;
            }
        }
    }
    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) {
        books[index] = book;
    }
    // public void removeBook(Book book){}
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
            }
        }
    }
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes
    
    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}