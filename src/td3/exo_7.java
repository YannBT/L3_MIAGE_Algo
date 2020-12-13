package td3;

import java.util.Scanner;

public class exo_7 {
	
	/*Ecrire un programme qui détermine si un tableau d’entiers est trié en ordre croissant.
	*/
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		exo_8();


	}
	
	static void exo_8() {
		int []t = {2,18,-22,20,8,-6,10,-24,13,3};
		int start= 0;
		int end= 0;
		int maxSum = t[0];
		int deb=0;
		int sum=t[0];
		for (int i=1;i<t.length;i++) {
			sum+=t[i];
			if(sum> maxSum) {
				maxSum=sum;
				start=deb;
				end=i;
			}
			if (sum<0) {
				sum=0;
				deb=i+1;
			}
		
		
			
		}
		
		System.out.print ("Max somme : "+ maxSum + " début :  " + start + " fin : " +end);
		
	}
	
	
		
	
	
	

}