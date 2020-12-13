package td3;

import java.util.Scanner;

public class exo_2 {
	
	/*Ecrire un programme qui convertisse un entier en son équivalent en base 2.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		int x = sc.nextInt();
		affBinaire(x);
		
		
		
	}
	
	static void affBinaire(int x) {
		int [] b = new int [32];
		int n= 0;
		do {
			b[n++] = x%2 ;
			x=x/2;
		}while (x>0);
		
		while(--n >= 0) {
			System.out.print(b[n]);
		}
		

	}

}