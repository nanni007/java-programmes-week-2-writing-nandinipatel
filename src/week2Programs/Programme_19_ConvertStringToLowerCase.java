package week2Programs;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scan.nextLine();
        Programme_19_ConvertStringToLowerCase obj = new Programme_19_ConvertStringToLowerCase();
        obj .convertStrintToLowerCase(uppercase);
        //close scanner
        scan.close();
    }
    //convert string to lower case
    public void convertStrintToLowerCase(String str){
        System.out.println("The Lowercase of the string is: " + str.toLowerCase());
    }

}
