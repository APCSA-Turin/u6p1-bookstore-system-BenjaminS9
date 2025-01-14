package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = "99";
    // //requires one empty constructor
    public IdGenerate() {}

    // public  getCurrentId(){}
    public static String getCurrentId() {
        return currentId;
    }
    // public  reset(){} //must reset the currentId back to 99
    public static void reset() {
        currentId = "99";
    }

    // public generateID(){} //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public static void generateID() {
        int numId = Integer.parseInt(currentId) + 1; //I learned this from: https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
        currentId = String.valueOf(numId); //I learned this from: https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
    }
}