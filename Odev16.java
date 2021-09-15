/**
 * Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */

		Scanner input= new Scanner(System.in);
		System.out.print("Lütfen pozitif bir sayı giriniz: ");
		int n= input.nextInt();
		
		for(int i=1; i<n; i*=2)
			System.out.println(i);
			
		
	}

}
