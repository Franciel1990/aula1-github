package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.ClienteBB;
import entities.Product;

public class BB {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.print("enter account number");
		int number = sc.nextInt();				
		System.out.print("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is ther an initial deposit (Y/N)?");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder,number, initialDeposit);
		}
		else {
			account = new Account(holder, number);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter deposit value:");
		// String initial = sc.next();
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data");
		System.out.println(account);

		
		System.out.print("Account data:%n");

		System.out.println("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated Account data: ");
		System.out.println(account);
		
		System.out.println();


		sc.close();

	}
}
