package td2;
import java.util.Scanner;

//Calculer le produit de 2 entiers positifs en n’utilisant que l’addition.

public class exo3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		produitonlyaddition();		
	}
	// Pour optimiser, il ne faut pas oublier de vérifier 
	// quelle variable est la plus petite
	static void produitonlyaddition () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int result = 0;
		
		if (x<y) {
			int aux=x;
			x=y;
			y=aux;
		}
			
		for (int i=1; i<= y; i++) {
			result= result+x;
		}
		System.out.println("Produit de deux entiers = "+ result);
	}
}
