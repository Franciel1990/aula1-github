package course;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Item = sc.nextDouble();
		double qtde = sc.nextDouble();

		if (Item == 1) { System.out.println(4*qtde+"Reais");}
		else if (Item == 2) { System.out.println(4*qtde+"Reais");}
		else if (Item == 3) { System.out.println(5*qtde+"Reais");}
		else if (Item == 4) { System.out.println(2*qtde+"Reais");}
		else if (Item == 5) { System.out.println(1.5*qtde+"Reais");}
		
		
		sc.close();
	}

}
