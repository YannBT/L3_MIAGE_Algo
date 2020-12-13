package td1;
import java.util.Scanner;
//Ecrire un programme qui calcule le maximum de 3 valeurs.


public class exo4 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		Maximum();		
	}
	
	static void Maximum () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		if (x>=y && x>=z) {
			System.out.println("Maximum = " +x);
		}
		else if (y>=x && y>=z) {
			System.out.println("Maximum = " +y);
		}
		else if (z>=y && z>=x) {
			System.out.println("Maximum = " +z);
		}
	
		
		
	}
}