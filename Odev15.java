/**
 * Tek Sayıların Toplamını Bulan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		double sum=0;
		
		Scanner input= new Scanner(System.in);
		
		int n;
		
		
		do {
			System.out.print("Lütfen sayı giriniz: ");
			n= input.nextInt();
			
			if(n%2==1) {
				sum+=n;
			}
		}
		while(n>=0);
		
		System.out.print("Girilen tek sayıların toplamı: "+sum);
		
	}

}


