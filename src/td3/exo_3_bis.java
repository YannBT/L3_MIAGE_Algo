package td3;

import java.util.Scanner;

public class exo_3_bis {
	
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
		System.out.println(DictoTableau(t));
		
	}
	
	static int[] saisieTableau(int taille) {
		int [] t= new int[taille];
		for (int i = 0; i < t.length; i++) {
		System.out.print("Entrer l'élement t[" + i + "]: ");
		t[i] = sc.nextInt();
		
		}
		return t;
	}
	
	static boolean DictoTableau(int [] t) {
		System.out.print("Quel entier ? : ");
		int n= sc.nextInt();
		
		int max = t.length-1;
		int min = 0;
		
		while(min<max) {
			int mil = (max+min) /2;
			if (n>t[mil]) {
				min=mil+1;
			} else {
				max=mil;
			}
			
		}
		return (t[min]==n);
	}
}