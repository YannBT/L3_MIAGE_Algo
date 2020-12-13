package td2;

import java.util.Scanner;

public class exo12 {
	
	
	/*Trouver les nombres cubes entre 0 et 999. Un nombre est dit cube s’il est égal à la somme des
cubes de ses chiffres. Exemple : 153 = 13
+53
+33
.*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_12();


	}
	
	static void exo_12() {
		for (int i=1; i <1000; i++) {
			if (cube(i)) {
				System.out.println(i+" est cube");
			}
		}
	}
	
	
	static boolean cube(int x) {
		int s =0;
		int a=x;
		
		while(x!=0) {
			int cf = x%10;
			s = s + (cf*cf*cf);
			x=x/10;
		}

		return (a==s);
		
		

		
	}
}

