/**
 * Dizideki Tekrar Eden Çift Sayıları Bulan Program
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i==value) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 28.09.2021
		 */	
				
		int[] array= {5, 3, 8, 10, -2, 5, -2, 7, 3, 8, 10};
		int[] duplicateArray= new int[array.length];
		
		int startIndex= 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if((i!=j) && (array[i]==array[j]) && (array[i]%2==0) && array[i]>=0) {
					if(!isFind(duplicateArray, array[i]))
						duplicateArray[startIndex++]= array[i];
					//break;
				}
			}
		}
		
		System.out.println(Arrays.toString(duplicateArray));
	}
}
