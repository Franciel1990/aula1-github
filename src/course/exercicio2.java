package course;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor <= 25) {
			System.out.println("Intervalo 0 a 25");
		} else if (valor <= 50) {
			System.out.println("Intervalo 25 a 50");
		} else if (valor <= 75) {
			System.out.println("Intervalo 50 a 75");
		} else if (valor <= 100) {
			System.out.println("Intervalo 75 a 100");
		} else if (valor > 100) {
			System.out.println("Fora do Intervalo");
		}

		sc.close();
		
	}
}
