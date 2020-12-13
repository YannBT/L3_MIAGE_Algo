package td3;

import java.util.Scanner;

public class exo_1 {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		int max=maxTableau(t);
		System.out.println(max);
		
		
		
	}
	
	static int[] saisieTableau(int taille) {
		int [] t= new int[taille];
		for (int i = 0; i < t.length; i++) {
		System.out.print("Entrer l'élement t[" + i + "]: ");
		t[i] = sc.nextInt();
		
		}
		return t;
	}
		
	static int maxTableau(int[] t) {
		int max = t[0];
		for (int i = 1; i < t.length; i++) {
			if (t[i]>max) {
				max=t[i];
			}
		}
		return max;
	}

}
