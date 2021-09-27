/**
 * Dizideki Elemanların Ortalamasını ve Harmonik Ortalamasını Hesaplayan Program
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
		
		
		int[] array= {1, 2, 4, 5, 6, 10, 2};
		double sum=0;
		
		for(int i=0; i< array.length; i++)
			sum+= array[i];
		System.out.println("Dizinin elemanların ortalaması: "+ (sum/array.length));
		
		
		double sum2= 1;
		for(int i=0; i<array.length; i++) {
			sum2+= 1.0/ array[i];
		}
		
		System.out.println("Dizinin harmonik ortalaması: "+ (array.length / sum2));
		
	}
}
