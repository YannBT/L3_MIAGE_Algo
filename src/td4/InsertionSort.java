package td4;

import java.util.Scanner;

public class InsertionSort {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		long tps = triInsertion(t);
		afficheTableau(t);
		
		System.out.println("temps " + tps + "msec");

	}
	
	
	static int[] saisieTableau(int taille) {
		int [] t= new int[taille+1];
		for (int i = 0; i < t.length; i++) {
		System.out.print("Entrer l'élement t[" + i + "]: ");
		t[i] = sc.nextInt();
		
		}
		return t;
	}
	
	static int[] initAleatoireTableau(int taille) {
		int []t = new int[taille];
		for (int i=0; i <taille; i++) {
			t[i] = (int) (Math.random() * taille);
		}
		return t;
	}
	
	static void afficheTableau(int[] t) {
		for (int i=0; i<t.length;i++) {
			System.out.print(t[i] + " ");
		}
		System.out.println();
	}
		
	static long triInsertion(int[] t) {
		
		long t0 = System.currentTimeMillis();
		
		for(int indDebNonTrie = 1; indDebNonTrie < t.length-1; indDebNonTrie++) {
			int aPlacer = t[indDebNonTrie];
			int i;
			for (i=indDebNonTrie; i>= 1 && t[i-1] >aPlacer; i++) {
				t[i] = t[i-1];
			}
			t[i] = aPlacer;
			
		}
		long t1 = System.currentTimeMillis();
		
		return t1-t0;
	}
	


}