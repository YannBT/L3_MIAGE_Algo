package td3;

import java.util.Scanner;

public class exo_5 {
	
	/*Ecrire un programme qui détermine si un tableau d’entiers est trié en ordre croissant.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		System.out.print("Entrer le degré : ");
		int degre = sc.nextInt();
		int [] coef = saisirTableauEntiers(degre+1);
		System.out.println("Entrer le x : ");
		int x = sc.nextInt();
		System.out.println("resultat = " + evaluerPolynome(coef,x));
		
	}
	
	static int evaluerPolynome (int []coef, int x) {
		int res= 0;
		int px=1;
		
		for (int i =0; i<coef.length; i++) {
			res+=coef[i] * px;
			px=px*x;
		}
		
		return res;
	}
	
	static int[] saisirTableauEntiers(int degre) {
		int [] t= new int[degre];
		for (int i=0;i<degre;i++) {
			System.out.print("Entrer les entiers ("+i+") = ");
			t[i]=sc.nextInt();
			
		}
		return t;
	}
	
	
	
	

}