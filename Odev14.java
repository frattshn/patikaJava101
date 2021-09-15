/**
 * Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		System.out.print("Lütfen sayıyı giriniz: ");
		int n= input.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		System.out.println();
		
		double sum=0;
		int sayac=0;
		for(int i=0; i<n; i++) {
			if(i%3==0 && i%4==0) {
				sayac++;
				sum+=i;
				System.out.println(i);
			}
		}
		
		System.out.println("Sayıların ortalaması: "+ sum/sayac);
	}

}


