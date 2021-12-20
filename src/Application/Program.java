package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangule	X: ");
		x.a = leitor.nextDouble();
		x.b = leitor.nextDouble();
		x.c = leitor.nextDouble();
		System.out.println("Enter the measures of triangule	Y: ");
		y.a = leitor.nextDouble();
		y.b = leitor.nextDouble();
		y.c = leitor.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
				
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");

			leitor.close();
		}
	}

}
