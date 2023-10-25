package week2Programs;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme_18_PrintOperation {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter First Number: ");
        int secondNumber = scan.nextInt();
        Programme_18_PrintOperation obj = new Programme_18_PrintOperation()
        obj.printTheOperation(firstNumber,secondNumber);
        //close scanner
        scan.close();
    }
    //printing the operations
    public void printTheOperation(int a,int b){
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
        System.out.println("The Difference of " + a + " and " + b + " is " + (a-b));
        System.out.println("The Product of " + a + " and " + b + " is " + (a*b));
        System.out.println("The Division of " + a + " and " + b + " is " + (a/b));
        System.out.println("The Remainder of " + a + " and " + b + " is " + (a%b));
    }
}
