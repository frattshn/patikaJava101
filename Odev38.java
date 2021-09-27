/**
 * Dizideki Elemanların Max ve Min Değerlerini Bulan Program
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 27.09.2021
		 */
		
		/*
		 * Arrays sınıfının metotları static olduğu için
		 * herhangi bir nesne üretmeden bu metotlara ulaşabiliriz.
		 */
		
		Scanner input= new Scanner(System.in);
		
		int[] array= {7, 2, 4, 5, 6, 10, 10};
		
		int min= array[0];
		int max= array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>= max) max= array[i];
			if(array[i]<=min) min=array[i];
		}
		System.out.println("Min: "+ min+"\nMax: "+ max);	
		
	}
}
