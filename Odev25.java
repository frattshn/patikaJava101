/**
 * 1-100 Arası Asay Sayıları Bulma
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 17.09.2021
		 */
		

		for(int j=2; j<100; j++) {
			int sayac=0;
			for(int i=2; i<j; i++) {
				if(j%i==0) sayac++;
			}
			if(sayac==0) System.out.println(j);
		}		
	}

}


