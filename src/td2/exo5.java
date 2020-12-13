package td2;
import java.util.Scanner;

/*Calculer le pgcd de 2 nombres (on soustrait le plus petit nombre du plus grand jusqu’à obtenir
l’égalité). Faire tourner à la main cet algorithme pour 65 et 10, en déduire une version améliorée
utilisant le reste de la division entière.
*/

public class exo5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		pgcd(10, 65);		
	}


	static void pgcd(int a, int b) {

		int res;
		while ((res= a%b)>0 ) {
			a=b;
			b=res;
		}
	
		System.out.println("pgcd = " + b);
	
}

}