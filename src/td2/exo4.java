package td2;
import java.util.Scanner;

/*Calculer le quotient et le reste de la division de 2 entiers positifs en n’utilisant que l’addition et
la soustraction.
*/
public class exo4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		QuotientetReste();		
	}
	
	static void QuotientetReste () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int q=0;
		int r=0;
		if (x<y) {
			int aux=x;
			x=y;
			y=aux;
		}
				
		while (x-y >0) {
			x=x-y;
			q=q+1;
		}
		r=x;
		System.out.println("Quotient = "+ q + ", Reste = " + r);
	}
}