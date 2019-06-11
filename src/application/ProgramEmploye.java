package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employer;

public class ProgramEmploye {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
				
		List<Employer> list = new ArrayList<>();
		

		System.out.print("how many employees will be registered?");
		int n = sc.nextInt();
		
				
		for (int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + i +": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			list.add(new Employer(id, name, salary));
			
		}
		
			System.out.println("Enter the employee id that will have salary increase : ");
			int id = sc.nextInt();
			Employer emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("This Id does not exist!");
			}
			else {
			System.out.println("Enter the percentage : ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			}
			
			System.out.println();
			System.out.println("List of employees: ");
			for (Employer obj : list) {
				System.out.println(obj);
			}
			
			
		sc.close();
		}
		
		

}
