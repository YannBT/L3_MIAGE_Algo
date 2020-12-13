package td2;

import java.util.Scanner;

public class exo10 {
	
	
	/*Ecrire un programme qui devine un entier entre 1 et 1000 choisi par l’utilisateur. Ce dernier
répondra aux questions de l’ordinateur par 0 (trouvé), 1 (trop petit) ou 2 (trop grand).*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_7();


	}
	
	static void exo_7() {
		int rep;
		int inf = 1;
		int sup = 1000;
		int nbCoups =0;
		do {
			nbCoups++;
			int mil = (inf+sup) / 2 ;
			System.out.println("Je pense a " + mil);
			rep=sc.nextInt();
			if (rep==1) {
				inf=mil+1;
			}else {
				sup=mil;
			}
		}while (rep!=0);
		
		System.out.println("trouvé en "+nbCoups + "coups");
	}

}