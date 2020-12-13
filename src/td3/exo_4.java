package td3;

import java.util.Scanner;

public class exo_4 {
	
	/*Ecrire un programme qui détermine si un tableau d’entiers est trié en ordre croissant.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		System.out.print("Entrer la taille : ");
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		System.out.println(EstTrie(t));
		
	}
	
	static int[] saisieTableau(int taille) {
		int [] t= new int[taille];
		for (int i = 0; i < t.length; i++) {
		System.out.print("Entrer l'élement t[" + i + "]: ");
		t[i] = sc.nextInt();
		
		}
		return t;
	}
	
	static boolean EstTrie(int [] t) {

		for (int i = 0; i < t.length-1; i++) {
			if (t[i]>t[i+1]) {
				return false;
			}
		}
		return true;
	}
}