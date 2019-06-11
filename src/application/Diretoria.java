package application;

import java.util.Scanner;

import entities.Aluno;

public class Diretoria {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o nome do aluno e suas Notas");
	
	Aluno aluno = new Aluno();
	aluno.name = sc.nextLine();
	aluno.nota1 = sc.nextDouble();
	aluno.nota2 = sc.nextDouble();
	aluno.nota3 = sc.nextDouble();
	
	System.out.println("Final grade ="+ aluno.notaFinal());
	if(aluno.notaFinal()>=60) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Failed, Missing "+aluno.aprovado());
	}
	
	
	}
}
