package course;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosParte2 {
	
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);//ele dever ser declarado antes do objeto scanner
		Scanner sc = new Scanner(System.in);
		
		
		int n1 = sc.nextInt();//35
		sc.nextLine();		
		String name = sc.nextLine();//Francielt ele lê a linha inteira
		char gender = sc.next().charAt(0);//M
		String s = sc.next();
		char letter = s.charAt(0);//para pegar o primeiro caracter da variável string
		// que foi declarada no string s = sc.next();
		int digit = Integer.parseInt(s.substring(1));	
			
		Locale.setDefault(Locale.US);
		double n2 = sc.nextDouble();
		
		// maria f 23 1.68
		String name2 = sc.next(); // lê até o primeiro espaço
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		
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
