package td2;
//Ecrire un programme qui calcule n !
import java.util.Scanner;

public class exo2 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		factorial();		
	}
	
	static void factorial () {
		int x= sc.nextInt();
		int result = 1 ;
		for (int i=1; i<= x; i++) {
			result= result *i;
		}
		System.out.println("Factorial = "+ result);
	}
}