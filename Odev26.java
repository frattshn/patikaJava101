/**
 * Fibonacci Serisi
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 17.09.2021
		 */
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b+ " ");
		for(int i=0; i<10; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		
	}

}


