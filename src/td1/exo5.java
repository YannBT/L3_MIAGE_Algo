package td1;
import java.util.Scanner;

/*Ecrire un programme qui trie 3 variables.
Exemple : x = 1, y = 10, z = 8 donnera x = 1, y = 8, z = 10
*/

public class exo5 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		Trier();		
	}
	
	static void Trier () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		int aux ;
		
		if(x>y) {
			aux=x;
			x=y;
			y=aux;
		}
		if(y>z) {
			aux=y;
			y=z;
			z=aux;
		}
		if (x>y) {
			aux=x;
			x=y;
			y=aux;
		}
		
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
		
	}
}