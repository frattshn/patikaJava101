/**
 * Üslü Sayı Hesaplayan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		int carpim=1;
		
		System.out.print("Tabanı giriniz: ");
		int taban= input.nextInt();
		
		System.out.print("Üssü giriniz: ");
		int us= input.nextInt();
		
		
		for(int i=0; i<us; i++) {
			carpim*=taban;
		}
		System.out.println(taban+" üssü "+us+": "+carpim);
		
	}

}


