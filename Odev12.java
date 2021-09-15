/**
 * Çin Zodyağı Hesaplama
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		String zodyag="";
		int dogumYili;
		
		Scanner input= new Scanner(System.in);
		System.out.print("Doğum yılınızı giriniz: ");
		dogumYili= input.nextInt();
		input.close();
		
		switch(dogumYili%12) {
		case 0:
			zodyag="Maymun";
			break;
		case 1:
			zodyag= "Horoz";
			break;
		case 2:
			zodyag= "Köpek";
			break;
		case 3:
			zodyag= "Fare";
			break;
		case 4:
			zodyag= "Öküz";
			break;
		case 5:
			zodyag= "Öküz";
			break;
		case 6:
			zodyag= "Kaplan";
			break;
		case 7:
			zodyag= "Tavşan";
			break;
		case 8:
			zodyag= "Ejderha";
			break;
		case 9:
			zodyag= "Yılan";
			break;
		case 10:
			zodyag= "At";
			break;
		case 11:
			zodyag= "Koyun";
			break;
		}
		
		System.out.println("Çin Zodyağı Burcunuz: "+zodyag);		
	}

}
