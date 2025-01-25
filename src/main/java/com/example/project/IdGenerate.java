package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    //the current ID is initialized to "99"
    private static String currentId = "99";
    //empty constructor
    public IdGenerate() {}

    //returns the current ID number
    public static String getCurrentId() {
        return currentId;
    }
    //resets the current ID number back to "99"
    public static void reset() {
        currentId = "99";
    }

    //adds one to the currentID by converting into an integer to add one and then back to a string
    public static void generateID() {
        int numId = Integer.parseInt(currentId) + 1; //I learned this from: https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
        currentId = String.valueOf(numId); //I learned this from: https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
    }
}