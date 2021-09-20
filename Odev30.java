/**
 * Recursive ile Üslü Sayı Hesaplama Programı
 */
import java.util.Scanner;

public class Main {

	static int usAlma(int taban, int us) {
		
		if(taban==1) return 1;
		else if(us==0) return 1;
		else return taban*usAlma(taban, us-1);
		
	}
	
	
		
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 20.09.2021
		 */
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Taban değerini giriniz: ");
		int taban= input.nextInt();
		
		System.out.print("Üs değerini giriniz: ");
		int us= input.nextInt();
		
		input.close();
		
		System.out.print("Sonuç: "+ usAlma(taban,us));
		
		
		
	}

}


