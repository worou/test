package nextApp;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Quel est votre nom ?\n");
		Scanner sc = new Scanner(System.in);
		String nom = sc.nextLine();
		
		System.out.println("");
		System.out.println("Bonjour " + nom + ".");
	}

}
