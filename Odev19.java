/**
 * Harmonik Seri Bulan Program
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
		double toplam=0;
		
		for(int i=1; i<=n; i++)
			toplam+=(1.0/i);
		
		System.out.println("Toplam: "+ toplam);
	}

}
