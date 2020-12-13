package td4;

import java.util.Scanner;

public class MergeSort {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		long tps = triFusion(t);
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
		
	static long triFusion(int[] t) {
		
		long t0 = System.currentTimeMillis();
		int []taux = new int[t.length];
		triFusionRec(t,0,t.length-1,taux);
		long t1 = System.currentTimeMillis();
		
		return t1-t0;
	}
	
	static void triFusionRec(int[] t, int deb, int fin, int[] taux) {
		if (deb>=fin) {
			return ;
		}
		int mil = (deb+fin)/2;
		
		triFusionRec(t,deb,mil,taux);
		triFusionRec(t,mil+1,fin,taux);
		
		int i=deb;
		int j=mil+1;
		int k=deb;
		
		while(i<=mil && j<=fin) {
			if(t[i] <= t[j]) {
				taux[k++] = t[i++];
			 
			}
			else {
				taux[k++] = t[j++];
			}
		}
		
		while(i <=mil) {
			taux [k++] = t[i++];
		}
		
		while(j <=fin) {
			taux [k++] = t[j++];
		}
		
		while(--k>=deb) {
			t[k] = taux[k];
		}
	}


}