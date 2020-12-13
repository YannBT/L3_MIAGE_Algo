package td4;

import java.util.Scanner;

public class BubbleSort {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int taille = sc.nextInt();
		int []t = initAleatoireTableau(taille);
		long tps = triBulles(t);
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
		
	static long triBulles(int[] t) {
		
		long t0 = System.currentTimeMillis();
		
		while(!estBon(t)) {
		for (int i = 0; i < t.length-1; i++) {
			if (t[i]>t[i+1]) {
				int tmp=t[i];
				t[i]=t[i+1];
				t[i+1]=tmp;
			}
		}
		
		}
		long t1 = System.currentTimeMillis();
		
		return t1-t0;
	}
	
	static boolean estBon(int[] t) {
		for (int i = 0; i < t.length-1; i++) {
			if (t[i]>t[i+1]) {
				return false;
			}
		
			
		}
		return true;
	}

}
