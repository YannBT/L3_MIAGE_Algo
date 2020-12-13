package td2;

// Ecrire un programme qui calcule la somme des n premiers entiers. 
 
import java.util.Scanner;
public class exo1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		somme();		
	}
	
	static void somme () {
		int x= sc.nextInt();
		int result = 0 ;
		for (int i=1; i<= x; i++) {
			result= result +i;
		}
		System.out.println("somme = "+ result);
	}
}