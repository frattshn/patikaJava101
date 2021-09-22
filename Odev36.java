/**
 * İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
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
				
		for(int row=0; row<matrix.length; row++) {
			for(int column=0; column<matrix[0].length; column++)
				matrix[row][column]= (int)(Math.random()*100);
		}	
		
		for(int row=0; row<matrix.length; row++) {
			for(int column=0; column<matrix[0].length; column++)
				System.out.print(matrix[row][column]+ " ");
		}
	}
}
