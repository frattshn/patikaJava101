/**
 * Boks Oyunu
 */
import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 21.09.2021
		 */
		
		Fighter f1= new Fighter("A", 10, 120, 100, 30);
		Fighter f2= new Fighter("B", 20, 85, 85, 40);
		
		Match match= new Match(f1, f2, 85, 100);
		match.run();
		
		
		
	}

}


