/**
 * Çift Boyutlu Diziler ile Harf Çizimi
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 27.09.2021
		 */	
		String[][] array= new String[9][4];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i==0 || i==4 || i==8) array[i][j]=" * ";
				else if(j==0 || j==3) array[i][j]=" * ";
				else array[i][j]="   ";
			}
		}
		
		for(String[] row : array) {
			for(String col : row) System.out.print(col);
			System.out.println();
		}		
	}
}
