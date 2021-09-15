/**
 * Yıldız ile Üçgen Yapımı
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 16.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		
		int n= input.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int k=1; k<=(n-i); k++)
				System.out.print(" ");
			
			for(int j=1; j<=(2*i)-1; j++)
				System.out.print("*");
			
			System.out.println(" ");
		}
	}

}


