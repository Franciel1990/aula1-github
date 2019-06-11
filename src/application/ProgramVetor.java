package application;

import java.util.Scanner;

import entities.ProductVector;

public class ProgramVetor {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		ProductVector[] vect = new ProductVector[10];
		int n = sc.nextInt();
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();
			
			vect[room] = new ProductVector(name,email,room);
		}
		for(int i = 0; i<10; i++) {
		if (vect[i]!= null) {
			System.out.println(vect[i].getRoom() +vect[i].getName()+", "+vect[i].getEmail());
		}
		}
		sc.close();
		}
		
		
	}

