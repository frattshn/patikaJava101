/**
 * Vücut Kitle İndeksi Hesaplayan Program
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		double boy, kilo;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen metre türünden boyunuzu girin: ");
		boy= input.nextDouble();
		
		System.out.print("Lütfen kg türünden kilonuzu girin: ");
		kilo= input.nextDouble();
		
		double indeks= kilo/(boy*boy);
		
		System.out.println("Vücut Kitle İndeksiniz: "+indeks);
	}

}
