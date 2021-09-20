/**
 * Recursive ile Asal Sayılar
 */
import java.util.Scanner;

public class Main {

	static boolean asalMi(int number, int i) {
		
		if(number==i || number==1) return true;
		
		if(number%i == 0) return false;
		
		return asalMi(number, i+1);
		
	
	}
	
	
		
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 20.09.2021
		 */
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Sayıyı giriniz: ");
		int number= input.nextInt();
		int i=2;
		
		if(asalMi(number, i)==true) System.out.println(number+" sayısı asaldır.");
		else System.out.println(number+ " sayısı asal değildir.");
		
		input.close();

		
		
		
	}

}


