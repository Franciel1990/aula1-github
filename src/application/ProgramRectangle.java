package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Rectangle;

public class ProgramRectangle {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("enter rectangle widcht and height:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.println("AREA ="+rectangle.area());
		System.out.println("PERIMETER ="+rectangle.perimeter());
		System.out.println("DIAGONAL ="+rectangle.diagonal());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
