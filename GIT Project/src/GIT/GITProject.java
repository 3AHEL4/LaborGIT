package GIT;

import java.util.Random;

public class GITProject {
	/* int Array anlegen - Wurzer
	 * Werte zuordnen - Schorn
	 * Methode, die die Summer aller Werte bildet - Wagger
	 * shiftLeft - Schöffmann
	 * shiftRight - Stocker
	 * rotateLeft - Steiner
	 * rotateRight - Widmann
	 */
	
	
	public int b [] = new int[10];
	
	public void werteGeben(int x){

		Random r = new Random();
		int i =0;
		for(; i <=10;i++){
			b[i]=r.nextInt(x);
		}
		System.out.println(""+b[i]);
	}
	
	public static void main(String[] args) {
		//		Das ist ein Programm, das über GIT mit anderen Usern geteilt wird.
		
	}

}
