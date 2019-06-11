package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Entre com o nome do Colaborador: ");
		emp.name = sc.nextLine();
		
		System.out.println("Entre com o salário do Colaborador: ");
		emp.salary = sc.nextDouble();
		System.out.print("Entre com o impost do Colaborador: ");
		emp.tax = sc.nextDouble();
		
	
		System.out.println("Employee: "+emp.name+", R$ "+emp.salario());
		
		System.out.println("Which percentage to increase salary");
		
		
		double percentage = sc.nextDouble();
		emp.addSalary(percentage);
		System.out.println();
		System.out.println("Employee: "+emp);	
		

	}

}
