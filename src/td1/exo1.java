package td1;
import java.util.Scanner;
//Ecrire un programme qui permute 2 variables entières. 


public class exo1 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		permuteavecaux();		
	}
	
	static void permuteavecaux () {
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		int aux = x;
		x=y;
		y=aux;
	
		
		System.out.println("x = "+ x + ", y = " + y);
	}
}