/**
 * Mükemmel Sayı Bulma
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 17.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		int n, toplam=0;
		
		System.out.print("Bir sayı giriniz: ");
		n=input.nextInt();
		
		for(int i=1; i<n; i++) {
			if(n%i==0)
				toplam+=i;
		}
		
		if(toplam==n)
			System.out.println(n+" bir mükemmel sayıdır.");
		else
			System.out.println(n+" bir mükemmel sayı değildir.");
		
		
	}

}


