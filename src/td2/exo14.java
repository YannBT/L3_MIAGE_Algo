package td2;

import java.util.Scanner;

public class exo14 {
	
	
	/*
	 * 
	 * 
	Calculer une valeur approchée de √a par la méthode de Newton dont la formule d’itération est :
	xn+1 = (xn + a/xn)/2. 
	Cette suite converge vers √a quelque soit x0 
	(i.e. xn+1 est une meilleure approximation de √a que xn). 
	La précision souhaitée est de 8 chiffres après la virgule.
		
	 *
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_12();

	}
	
	static void exo_12() {
		affBonnetAne(sc.nextInt(),sc.nextInt());
	}

	static void affBonnetAne(int a, int b) {
		double x0 = (1+a)/2;
		double x1 = 0;
		int n=b;
		for (int i=0;i<=n+1;i++) {
			x1=(x0 + a/x0)/2;
			x0=x1;
			
			
		}
		
		System.out.println(Math.round(x1*100000000)/100000000.0);
		
	}
	
}
	
