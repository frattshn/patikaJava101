/**
 * Recursive ile Fibonacci Fonksiyonu
 */
import java.util.Scanner;

public class Main {

	static int fibonacci(int number) {
		if(number==1 || number==2)
			return 1;
		else if(number<1)
			return 0;
		else return fibonacci(number-2) + fibonacci(number-1);
	}

	
	
	
	
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 20.09.2021
		 */
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz: ");
		int a= input.nextInt();
		System.out.println(fibonacci(a));
		
		
	}

}


