package course;

import java.util.Scanner;

public class exercicio1 {


		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);		
			
			int valor = sc.nextInt();
			int valor2 = sc.nextInt();
			int valor3 = sc.nextInt();
			
				System.out.println(valor);
				System.out.println(valor2);
				System.out.println(valor3);
			if (valor < valor2) {
				if (valor2 < valor3) {
				System.out.println(valor3 + " é o maior número");}
				else if ( valor3 <valor2) {
					System.out.println(valor2+"é o maior número");
				}
			}
			
			else {
				System.out.println(valor + " é o maior número");
			}
		}
}
