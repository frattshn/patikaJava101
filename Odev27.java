/**
 * Palindrom mu Fonksiyonu
 */
import java.util.Scanner;

public class Main {

	
	static boolean isPalindrom(int number) {
		int temp=number, reverseNumber=0, lastNumber;
		while(temp!=0) {
			
			lastNumber= temp%10;
			
			reverseNumber= (reverseNumber*10)+lastNumber;
			
			temp= temp/10;
		}
		
		if(reverseNumber==number) return true;
		else return false;
		
	}
	
	
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 20.09.2021
		 */
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int a= input.nextInt();
		
		if(isPalindrom(a)) System.out.println("Sayı palindrom!");
		else System.out.println("Sayı palindrom değil!");
		
	}

}


