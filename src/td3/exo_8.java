package td3;

import java.util.Scanner;

public class exo_8 {
	
	/*Ecrire un programme qui détermine si un tableau d’entiers est trié en ordre croissant.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		affDecomp(5);

	}

	static void affDecomp(int n) {
		int[]  t = new int [n];
		int lg = n;
		for (int i=0; i <n; i++)
			t[i] = 1 ;
		for(;;) {
			//afficher la decomposition
			afficheTableau(t,lg);
			// est-ce la dernière
			if (lg==1)
				break;
			//calcul de la decomposition suivante
			lg--;
			//on incrémente l'avant-dernier
			t[lg-1] ++;
			//on met à sa droite autant de 1 que la valeur du dernier -1
			
			int nb1 = t[lg] -1 ; //nb13 = nb de 1 à mettre à droite
			
			t[lg] = 1 ; // en fait il suffit d'en mettre 1 car tout le reste est déjà à 1
			lg+=nb1;
			}
		
		
		}
	
	static void afficheTableau(int[] t, int nb) {
		for (int i = 0; i < nb; i++) {
		System.out.print(t[i] + " ");
		}
		System.out.println();
		}
		
		
	
		
	}



	
	
