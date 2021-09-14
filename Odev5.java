/**
 * Dairenin Alanını ve Çevresini Hesaplayan Program
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		double r, a, alan, cevre;
		final double pi=3.14;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen dairenin yarıçapını giriniz: ");
		r= input.nextDouble();
		
		alan= pi*r*r;
		cevre= 2*pi*r;
		
		System.out.println("Dairenin alanı: "+alan);
		System.out.println("Dairenin çevresi: "+cevre);
		
		System.out.print("a açısını giriniz: ");
		a= input.nextDouble();
		
		System.out.println("Daire diliminin alanı: "+ (pi*r*r*a)/360.0);
	}
