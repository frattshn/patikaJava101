/**
 * forEach Kullanımı
 */

package patikaJava101;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 22.09.2021
		 */
		
		int[][] matris= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		System.out.println("Normal if ile matris elemanlarını yazma: ");
		for(int i=0; i<matris.length; i++) {
			for(int j=0; j<matris[0].length; j++)
				System.out.print(matris[i][j]+ " ");
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("forEach ile matris elemanlarını yazma: ");
		for(int[] i:matris) {
			for(int j: i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
