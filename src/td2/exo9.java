package td2;

import java.util.Scanner;

public class exo9 {
	
	
	/*Trouver le kième chiffre (en partant de la droite) d’un entier donné*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_9();


	}
	
	static void exo_9() {

		System.out.println("chiffre :" + kIemeChiffre(sc.nextInt(),sc.nextInt()));
		
	}
	
	static int kIemeChiffre(int x, int k) {
		while(--k >0) {
			x=x/10;
		}
		return x%10;

	}
}