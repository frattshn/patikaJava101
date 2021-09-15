/**
 * Artık Yıl Hesaplama
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Yıl giriniz: ");
		int yil= input.nextInt();
		input.close();
		
		if(yil%4==0) {
			if(yil%100 == 0) {
				if(yil%400==0)
					System.out.println(yil+" bir artık yıldır!");
				else
					System.out.println(yil+" bir artık yıl değildir!");
			}
			else
				System.out.println(yil+" bir artık yıldır!");
		}
		else
			System.out.println(yil+ " bir artık yıl değildir!");
				
	}

}
