package td2;

import java.util.Scanner;

public class exo11 {
	
	
	/*Trouver les nombres parfaits inférieurs à 10000. Un nombre est parfait s’il est la somme de ses
diviseurs propres (i.e. tous les diviseurs sauf le nombre lui-même). Exemple : 28=1+2+4+7+14.*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_7();


	}
	
	static void exo_7() {
		for (int i=1; i <=10000; i++) {
			if (estParfait(i)) {
				System.out.println(i+" est parfait");
			}
		}
	}
	static boolean estParfait(int x) {
			int s =0;
			int fin = x/2;
			for (int d=1; d<=fin; d++) {
				if(x%d == 0) {
					s+=d;
				}
			}
			return (x==s);
			
		}
			
	}

