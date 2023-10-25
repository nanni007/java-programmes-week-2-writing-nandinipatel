package week2Programs;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to the java program to add two binary numbers");
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first binary number");
        String first = scan.nextLine();
        System.out.println("Enter second binary number");
        String second = scan.nextLine();
        String addition = addTwoBinaryNumbers(first, second);
        System.out.println("The Addition of two binary numbers is: " + addition);
        //close scanner
        scan.close();
    }
    //adding the two binary numbers
    public static String addTwoBinaryNumbers(String first,String second){

    int b1 = Integer.parseInt(first, 2);
    int b2 = Integer.parseInt(second, 2);
    int sum = b1 + b2;
    return Integer.toBinaryString(sum);
}
}
