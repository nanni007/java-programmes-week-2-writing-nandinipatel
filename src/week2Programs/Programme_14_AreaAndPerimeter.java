package week2Programs;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_AreaAndPerimeter {
    //Calculating Area and Perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(int height, int width){
        int perimeter = 2* (height +width);
        int area = (height * width);
        System.out.println("The Area of Rectangle is : " + area);
        System.out.println("The Perimeter of Rectangle is : " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int height = scan.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int width = scan.nextInt();
        areaAndPerimeterOfRectangle(height,width);
    //closing scanner
        scan.close();
    }
}
