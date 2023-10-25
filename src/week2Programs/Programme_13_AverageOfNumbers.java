package week2Programs;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double x = scan.nextDouble();
        System.out.println("Enter Second Number: ");
        double y = scan.nextDouble();
        System.out.println("Enter Third Number: ");
        double z = scan.nextDouble();
        averageOfThreeNumbers(x,y,z);
        //closing scanner
        scan.close();
    }
    //calculating the average of the three numbers
    public static void averageOfThreeNumbers(double x,double y, double z){
        double average = (x+y+z)/3;
        System.out.println("The average of " + x + " , " + y + " and " + z + " is: " + average );

    }
}
