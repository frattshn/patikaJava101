/*
*Taksimetre Hesaplayan Program
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		double kmUcret= 2.20;
		double mesafe;
		double ucret=10;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen gidilen mesafeyi(km) yazınız: ");
		mesafe= input.nextDouble();
		ucret+= mesafe*kmUcret;
		
		if(ucret<20) {
			System.out.println("Ödenecek tutar: "+20);
		}
		else {
			System.out.println("Ödenecek tutar: "+ucret);
		}
		
	}

}
