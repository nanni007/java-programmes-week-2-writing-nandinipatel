package week2Programs;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float temp =scan.nextFloat();
        //obj creation
        Programme_7_TempConversion obj = new Programme_7_TempConversion();
        obj.convertTempToDegreeCelsius(temp);
        //closing the scanner object
        scan.close();
    }
    //temp conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5/9);
        System.out.println("The temprature " + temp + "Fahrenheit isequal to " + c + " Degrees Celsius");
    }
}
