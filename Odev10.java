/**
 * Hava Sıcaklığına Göre Etkinlik Önerme
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		int sicaklik;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen sıcaklığı girin: ");
		sicaklik= input.nextInt();
		
		if(sicaklik<5)
			System.out.println("Kayak yapabilirsiniz!");
		else if(sicaklik>=5 && sicaklik<15)
			System.out.println("Sinemaya gidebilirsiniz!");
		else if(sicaklik>=15 && sicaklik<25)
			System.out.println("Pikniğe gidebilirsiniz!");
		else
			System.out.println("Yüzmeye gidebilirsiniz!");
	}

}
