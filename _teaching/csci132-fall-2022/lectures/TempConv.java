package day2;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Double fahr;  // declare variables
        Double cel;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + cel);
        
        /*
        Ask the user for another temperature report it back in Kelvin.
        Subtract 32 from the Fahrenheit temperature.
        Multiply this number by 5.
        Divide this number by 9.
        Add 273.15 to this number.
        */
        

    }
}