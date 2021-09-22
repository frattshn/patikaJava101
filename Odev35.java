/**
 * Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
 */

package patikaJava101;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 22.09.2021
		 */
		
		int[][] matrix= new int[3][4];
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter "+ matrix.length+" rows and "+matrix[0].length+" columns: ");
		
		for(int row=0; row<matrix.length; row++) {
			for(int column=0; column<matrix[0].length; column++)
				matrix[row][column]= input.nextInt();
		}		
	}
}
