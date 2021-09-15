/**
 * Faktöriyel Hesaplayan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		
		int faktoriyel=1;
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		
		if(n==0)
			System.out.println("0 faktoriyel: 1");
		else if(n<0)
			System.out.println("Girdiğiniz değer negatif olamaz!");
		else {
			for(int i=n; i>1; i--) {
				faktoriyel*=i;
			}
			System.out.println(n+" faktoriyel: "+faktoriyel);
		}	
	}

}


