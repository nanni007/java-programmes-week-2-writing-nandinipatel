package week2Programs;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first variable value: ");
        int first = scan.nextInt();
        System.out.println("Enter second variable value:");
        int second = scan.nextInt();
        Programme_15_SwapTheValue obj = new Programme_15_SwapTheValue();
        obj.swapTheValue(first, second);
        //closing the scanner object
    }
    //Swapping the value of the variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before swapping, the values of the first varibale is : " + a + " and the second variable is: " + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping, the values of the first varibale is : " + a + " and the second variable is: " + b);
    }

}
