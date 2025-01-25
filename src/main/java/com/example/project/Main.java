package com.example.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("*******************************************");
        System.out.println("*************** The Library ***************");
        System.out.println("*******************************************");
        System.out.println("//////////// Select an Option: ////////////");
        System.out.println("-------------------------------------------");
        System.out.println("Select 0 to Exit.");
        System.out.println("Select 1 to Open a New Account.");
        System.out.println("Select 2 to Delete a User.");
        System.out.println("Select 3 to Add a New Book to the Library.");
        System.out.println("Select 4 to Delete a Book from the Library");
        System.out.println("Select 5 to Insert a Book to the Library.");
        System.out.println("Select 6 to Display all Available Books.");
        System.out.println("Select 7 to Display all Users.");
        System.out.println("Select 8 to Display a User's Borrowed Books.");
        int userChoice = scan.nextInt();
        while (userChoice < 9 && userChoice != 0) {
            
        }
    }
}