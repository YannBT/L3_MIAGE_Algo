package td2;

import java.util.Scanner;

public class exo7 {
	
	
	/*Calculer une valeur approché de p en utilisant le fait que la somme :
		1 – 1/3 + 1/5 – 1/7 + 1/9 – 1/11 … tend vers p/4
		(on demande le nombre de termes à additionner à l’utilisateur)
	 																		*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_7();


	}
	
	static void exo_7() {
		int n= sc.nextInt();
		double pi = calculPi(n);
		System.out.println("pi calcul :" +pi);
		System.out.println("pi java :" + Math.PI) ;
		
	}
	
	static double calculPi(int n) {
		double s = 0;
		double num = 1;
		double den = 1;
		for(int i=0;i<n;i++) {
			s = s + (num/den);
			num= -num ;
			den = den + 2;
			
		}
		return s*4;
	}

}
