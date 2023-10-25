package week2Programs;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length of the triangle: " );
        int length = scan.nextInt();
        System.out.println("Enter the height of the triangle: ");
        int height = scan.nextInt();
        areaOfTriangle(height,length);
        //closing the scanner object
        scan.close();
    }
    //Calculating the area of triangle with no return type with parameter method
public static void areaOfTriangle(int length, int height){
        int area = (length*height)/2;
    System.out.println("The Area of a triangle is: " + area);
}
}
