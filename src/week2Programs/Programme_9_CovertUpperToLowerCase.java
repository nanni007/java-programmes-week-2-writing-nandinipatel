package week2Programs;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_CovertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the uppercase string: ")
        String uppercase = scan.nextLine();
        Programme_9_CovertUpperToLowerCase obj = new Programme_9_CovertUpperToLowerCase();
        obj.convertUppercaseToLowerCase(uppercase);
        //closing scanner object
        scan.close();
    }
    //Conversion of Uppercase to Lowercase method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lower case value is: " +text.toLowerCase());
    }
}
