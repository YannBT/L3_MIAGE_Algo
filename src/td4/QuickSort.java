package td4;

import java.util.Scanner;

public class QuickSort {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		long tps = triRapide(t);
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
		
	static long triRapide(int[] t) {
		
		long t0 = System.currentTimeMillis();
		
		triRapideRec(t,0,t.length-1);
		long t1 = System.currentTimeMillis();
		
		return t1-t0;
	}
	
	static void triRapideRec(int[] t, int deb, int fin) {
		if (deb>=fin) {
			return ;
		}
		int pivot = t[(deb+fin)/2];
		
		int i=deb;
		int j=fin;
		
		do {
			while(t[i] < pivot) {
				i++;
			}
			while(t[j] > pivot) {
				j--;
			}
			
			if (i<=j) {
				int aux=t[i];
				t[i] = t[j];
				t[j] = aux;
				i++;
				j--;
			}
			
		}while (i<=j);
		
		
		triRapideRec(t,deb,j);
		triRapideRec(t,i,fin);
	}


}