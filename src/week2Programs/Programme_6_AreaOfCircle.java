package week2Programs;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declarations for reading input from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scan.nextDouble();
        areaOfCircle(radius);
        //closing the scanner object
        scan.close();
    }
    //calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area= (pi*radius*radius);
        System.out.println("The Area of Circle is: " + area);
    }
}
