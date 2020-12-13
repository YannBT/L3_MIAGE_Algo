package td4;

import java.util.Scanner;

public class SelectionSort {
	
	/*Calculer une valeur approchée de ex en utilisant le fait que la somme :
		1 + x + x2/2! + x3/3! + x4/4! +… tend vers e^x
		On demande x et le nombre de termes à l’utilisateur.
	
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int taille = sc.nextInt();
		int []t = saisieTableau(taille);
		long tps = SelectionMax(t);
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
		
	static long SelectionMax(int[] t) {
		
		long t0 = System.currentTimeMillis();
		
		for(int indFin=t.length -1; indFin>0; indFin--) {
			int indMax = 0;
			for (int i=1; i<=indFin; i++) {
				if (t[i]> t[indMax]) {
					indMax = i;
				}
			}
			int aux = t[indMax];
			t[indMax] = t[indFin];
			t[indFin] = aux;
			
		}
		long t1 = System.currentTimeMillis();
		
		return t1-t0;
	}
	


}
