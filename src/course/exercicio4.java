package course;

public class exercicio4 {
	public static void main(String[] args) {
		String original = "aveswe ASDFASDF asdf AFA jjjJjJJjJJjJJj";
		
		String s01 = original.toUpperCase();//transformar tudo em maiúscula 
		// já para tudo minúsculo deve ser .toLowerCase();
		String s02 = original.trim(); // elimina espaços no começo e final
		String s04 = original.substring(4,7);
		double s05 = s04;
		
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s04);
		

	}
}
