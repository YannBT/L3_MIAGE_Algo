  
package td1;
import java.util.Scanner;
//Ecrire un programme qui décompose prix en pièces/billets de 20 €, 10 €, 5 €, 2 € et 1 €.


public class exo7 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		Decomposer();		
	}
	
	static void Decomposer () {
		int n= sc.nextInt();
		
		int vingt = 0 ;
		int dix= 0;
		int cinq = 0;
		int deux = 0;
		int un = 0;
		
		if (n>=20) {
			vingt=n/20;
			n=n%20;
		}
		if (n>=10) {
			dix=n/10;
			n=n%10;
		}
		if (n>=5) {
			cinq=n/5;
			n=n%5;
		}
		if (n>=2) {
			deux=n/2;
			n=n%2;
		}
		if (n>=1) {
			un=n;
		}
	
	System.out.println("20€ = " +vingt +", 10€ ="+dix+", 5€ ="+cinq+", 2€ ="+deux+", 1€ ="+un);	
		
	}
}