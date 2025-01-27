package com.example.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookStore store = new BookStore();
        //placeholder books from the test code
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",2);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b4);
        store.addBook(b5);
        IdGenerate id = new IdGenerate();
        System.out.print("Create a new username: ");
        String name = scan.nextLine();
        User newUser = new User(name, id.getCurrentId());
        store.addUser(newUser);
        int userChoice = -1;
        while (userChoice < 9 && userChoice != 0) {
            System.out.println("-------------------------------------------");
            System.out.println("**************  WELCOME TO:   *************");
            System.out.println("*************** The Library ***************");
            System.out.println("*******************************************");
            System.out.println("//////////// Select an Option: ////////////");
            System.out.println("-------------------------------------------");
            System.out.println("Select 0 to Exit.");
            System.out.println("Select 1 to Borrow a Book from the Library.");
            System.out.println("Select 2 to Return a Book to the Library.");
            System.out.println("Select 3 to Select Where to Place a Book in the Library.");
            System.out.println("Select 4 to Display all Available Books.");
            System.out.println("Select 5 to Display all Users of the Library.");
            System.out.println("Select 6 to Add an Account.");
            System.out.println("Select 7 to Delete an Account.");
            System.out.println("-------------------------------------------");
            userChoice = scan.nextInt();
            scan.nextLine();
            if (userChoice == 1) { //removes a book from the library
                Book[] bookList = store.getBooks();
                boolean success = false;
                System.out.println("What book would you like to borrow?");
                String bookName = scan.nextLine();
                for (int i = 0; i < 5; i++) {
                    if (bookList[i] != null && bookList[i].getTitle().equals(bookName)) {
                        store.removeBook(bookList[i]);
                        success = true;
                    }
                }
                if (success) {
                    System.out.println("Successfully borrowed a copy of the book.");
                } else {
                    System.out.println("Failed to borrow a copy.");
                }
            } else if (userChoice == 2) { //adds a book to the library
                Book[] bookList = store.getBooks();
                System.out.println("What book would you like to return?");
                String bookName = scan.nextLine();
                boolean success = false;
                for (int i = 0; i < 5; i++) {
                    if (bookList[i].getTitle().equals(bookName)) {
                        store.addBook(bookList[i]);
                        success = true;
                    }
                }
                if (success) {
                    System.out.println("Successfully returned a copy of the book.");
                } else {
                    System.out.println("Failed to return a copy.");
                }
            } else if (userChoice == 3) { //inserts a new book into the library
                System.out.println("What book would you like to insert?");
                String bookName = scan.nextLine();
                System.out.print("Author: ");
                String bookAuthor = scan.nextLine();
                System.out.print("Publication Year: ");
                int publishYear = scan.nextInt();
                scan.nextLine();
                System.out.print("ISBN: ");
                String isbn = scan.nextLine();
                System.out.print("Quantity: ");
                int quantity = scan.nextInt();
                Book insertBook = new Book(bookName, bookAuthor, publishYear, isbn, quantity);
                System.out.println("At what index do you want to insert it?");
                int index = scan.nextInt();
                store.insertBook(insertBook, index);
            } else if (userChoice == 4) { //lists out all books in a store
                System.out.println(store.bookStoreBookInfo());
            } else if (userChoice == 5) { //lists out all users in a store
                for (int i = 0; i < store.getUsers().length; i++) {
                    if (store.getUsers()[i] != null) {
                        System.out.println(store.getUsers()[i].getName());
                    }
                } 
            } else if (userChoice == 6) { //adds a user to the store
                System.out.print("Insert a name: ");
                String addName = scan.nextLine();
                IdGenerate.generateID();
                User addUser = new User(addName, id.getCurrentId());
                store.addUser(addUser);
            } else if (userChoice == 7) { //removes a user from the store
                System.out.print("Insert a name: ");
                String removeName = scan.nextLine();
                User removeUser = null;
                for (int i = 0; i < store.getUsers().length; i++) {
                    if (store.getUsers()[i] != null && store.getUsers()[i].getName().equals(removeName)) {
                        removeUser = store.getUsers()[i];
                    }
                }
                store.removeUser(removeUser);
            }
        }
    }
}