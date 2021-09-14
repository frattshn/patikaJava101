import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		double kmUcret= 2.20;
		double mesafe;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen gidilen mesafeyi(km) yazınız: ");
		mesafe= input.nextDouble();
		
		if(kmUcret*mesafe<20) {
			System.out.println("Ödenecek tutar: "+20);
		}
		else {
			System.out.println("Ödenecek tutar: "+kmUcret*mesafe);
		}
		
	}

}
