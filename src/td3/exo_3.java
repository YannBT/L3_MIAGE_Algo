package td3;

import java.util.Scanner;

public class exo_3 {
	
	/*Ecrire un programme qui saisit un tableau d’entiers et détermine si un entier donné appartient au
tableau ou non. Même chose si l’on sait que le tableau est trié (dichotomie).
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		System.out.print("Entrer la taille : ");
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		System.out.println(DansTableau(t));
		
	}
	
	static int[] saisieTableau(int taille) {
		int [] t= new int[taille];
		for (int i = 0; i < t.length; i++) {
		System.out.print("Entrer l'élement t[" + i + "]: ");
		t[i] = sc.nextInt();
		
		}
		return t;
	}
	
	static boolean DansTableau(int [] t) {
		System.out.print("Quel entier ? : ");
		int n= sc.nextInt();
		
		for (int i = 0; i < t.length; i++) {
			if (n==t[i]) {
				return true;
			}
		}
		return false;
	}
}