package td2;

import java.util.Scanner;

public class exo8 {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		int n= sc.nextInt();
		int x= sc.nextInt();
		double Ep = calculEp(n,x);
		System.out.println("e calcul :" + Ep);
		System.out.println("e java :" + Math.E) ;
		
	}
	
	static double calculEp(int n, int x) {
		double s = 1;
		double num = x;
		double den = 1;
		for(int i=1;i<n;i++) {
			s = s + (num/den);
			num= num*x ;
			den = den * i;
			
		}
		return s;
	}

}
