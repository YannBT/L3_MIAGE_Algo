package td1;
import java.util.Scanner;
/*Ecrire un programme qui permute circulairement à gauche 3 variables.
Exemple : x = 1, y = 10, z = 8 donnera x = 10, y = 8, z = 1 
*/ 

public class exo3 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		PermuteCirculaire();		
	}
	
	static void PermuteCirculaire () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		int aux = x;
		x=y;
		y=z;
		z=aux;
	
		
		System.out.println("x = "+ x + ", y = " + y+ ", z = " + z);
	}
}