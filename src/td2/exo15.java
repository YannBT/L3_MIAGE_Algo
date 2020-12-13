package td2;

import java.util.Scanner;

public class exo15 {
	
	
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
		affBonnetAne(sc.nextInt());
	}

	static void affBonnetAne(int a) {
		int i=2;
		System.out.print(a +" = ");
		do {
			if(a%i!=0) {
				i++;
			}
			else{
				a=a/i;
				System.out.print(i + "*");
			}
			
		}while (a!=0);
	}
	
}
	
