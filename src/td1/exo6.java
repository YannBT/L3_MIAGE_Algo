package td1;
import java.util.Scanner;

/*Ecrire un programme qui demande une note (sur 20) et affiche la mention :
• « recalé » entre [0,10[
• « passable » entre [10, 12[
• « assez bien » entre [12,14[
• « bien » entre [14,16[
• « très bien » [16,20]
On n'a pas besoin de vérifier que la note entrée soit valide (entre 0 et 20).
*/

public class exo6 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String arg[]) {
		Mention();		
	}
	
	static void Mention () {
		int n= sc.nextInt();

		if (n>=0 && n<10) {
			System.out.println("Recalé");
		}
		else if (n>=10 && n<12) {
			System.out.println("Passable");
		}
		else if (n>=12 && n<14) {
			System.out.println("Assez bien");
		}
		else if (n>=14 && n<16) {
			System.out.println("Bien");
		}
		else if (n>=16 && n<20) {
			System.out.println("Très bien");
		}
		
		
	}
}