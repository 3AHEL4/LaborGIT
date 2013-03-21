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
	
	
	public static int b [] = new int[10]; // Wurzer
	
	public static void werteGeben(int x){ //Schorn

		Random r = new Random();
		int i =0;
		for(; i <=10;i++){
			b[i]=r.nextInt(x);
		}
		System.out.println(""+b[i]);
	}
	
   public static void summeBilden(){ // Wagger
	   int sum = 0;
	   
	   for(int i=0 ; i<10 ; i++){
		   sum = sum + b[i];
	   }
	   System.out.println("Summe = "+sum);  
   }
   public static void printArray(int[] array){ //Steiner
		System.out.println();
		System.out.println();
		for(int i = 0; i < array.length;i++){
			System.out.print(" "+array[i]);
		}
	}
	public static void shiftLeft(int[] array, int anzahl){ //Schöffmann
		for(int j = 0; j < anzahl; j++){
			for(int i = 0;i<array.length-1;i++){
				array[i]=array[i+1];
			}
			array[array.length-1]=0;
		}
	}
	public static void rotateLeft(int[] array, int anzahl){ //Steiner
		int x = array[0];
		for(int j = 0; j < anzahl; j++){
			for(int i = 0;i<array.length-1;i++){
				array[i]=array[i+1];
			}
			array[array.length-1]=x;
		}
	}
	public static void shiftRight(int[] array, int anzahl){ //Stocker
		for(int j = 0; j < anzahl; j++){
			for(int i = array.length-1;i>0;i--){
				array[i]=array[i-1];
			}
			array[0]=0;
		}
	}
	public static void rotateRight(int[] array, int anzahl){ //Widmann
		int x = array[array.length-1];
		for(int j = 0; j < anzahl; j++){
			for(int i = array.length-1;i>0;i--){
				array[i]=array[i-1];
			}
			array[0]=x;
		}
	}
	
	public static void main(String[] args) {
		//		Das ist ein Programm, das über GIT mit anderen Usern geteilt wird.
		werteGeben(10);
		summeBilden();
		
		
	}

}
