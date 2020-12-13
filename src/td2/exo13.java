package td2;

import java.util.Scanner;

public class exo13 {
	
	
	/*
	 * 
	 * Ecrire un programme qui affiche un bonnet d’âne de n lignes. Exemple n=4 :
	 * 
	 *      *
	 **    **
	 ***  ***
	 ********
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_12();

	}
	
	static void exo_12() {
		affBonnetAne(sc.nextInt());
	}

	static void affBonnetAne(int n) {
		int nbEspaces = 2*n -2;
		for (int i=1; i<=n; i++) {
			affNCarac(i,'*');
			affNCarac(nbEspaces,' ');
			affNCarac(i,'*');
			System.out.println();
			nbEspaces-=2;
		}
	}
	
	static void affNCarac(int n, char c) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
}
	
