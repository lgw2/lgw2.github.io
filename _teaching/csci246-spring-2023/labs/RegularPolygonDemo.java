package lab04Starter;

import java.util.Scanner;

public class RegularPolygonDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		while (!scr.hasNextDouble()) {
			System.out.println("A number please: ");
			scr.nextLine();
		}
		double sideLength = Math.abs(scr.nextDouble());
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%20S %15S %15S %n", "Regular Polygon", "Area", "Perimeter");
		
		// Uncomment the following code when you have the triangle and square implemented
		
//		System.out.printf("%20s", "Equilateral Triangle");
//		RegularPolygon myPoly = new EquilateralTriangle(sideLength);
//		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
// 
//		System.out.printf("%20s", "Square");
//		myPoly = new Square(sideLength);
//		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		// TODO: add code to test the pentagon and hexagon. 
		
		System.out.println("----------------------------------------------------");
		System.out.println("<end>");
		scr.close();

	}
}
