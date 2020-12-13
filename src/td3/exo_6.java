package td3;

import java.util.Scanner;

public class exo_6 {
	
	/*Ecrire un programme qui détermine si un tableau d’entiers est trié en ordre croissant.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		System.out.print("Entrer la taille : ");
		int max = sc.nextInt();
		chercherNonBarre(max);

		
	}
	
	static void chercherNonBarre(int max) {
		boolean [] t = new boolean [max+1];
		t[0]=t[1]=true;
		for (int i=2;i<t.length;i++) {
			if(!t[i]) {
				System.out.print (i+" ");
				for (int j=i*2;j<t.length;j=i+j) {
					t[j]=true;

			}
		}
	}
	}
	

}