package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); //35
		sc.nextLine();
		String name = sc.nextLine();//bobo brown
		char gender = sc.next().charAt(0);//f
		//b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		//4.32
		
		
		
		double n2 = sc.nextDouble();
		
		//maria f 23 1.68
		
		String name2=sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		Double height = sc.nextDouble();
		
		
		
		
		
		
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
		
		
	}

}
