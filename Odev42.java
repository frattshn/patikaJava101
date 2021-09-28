/**
 * Matrisin Transpozesi
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 28.09.2021
		 */	

		
		int[][] array= {
				{1, 2, 3},
				{4, 5, 6},
		};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int[][] transpozeArray= new int[array[0].length][array.length];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				transpozeArray[j][i]= array[i][j];
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(transpozeArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
