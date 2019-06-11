package course;

import java.util.Scanner;

public class aulaBitaBit {
	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		System.out.println("-------------");
		System.out.println("what time is it?");
		
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		
		if (hora<12) {
			System.out.println("Bom dia!");
		}
		else if (hora<18) {
			System.out.println("Boa tarde!");
					}
		else {
			System.out.println("Boa noite!");
		}
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {

			System.out.println("6th bit is false!");
		}
		
		sc.close();
		
		
		
		
		
	}

}
