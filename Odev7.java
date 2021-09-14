/**
 * Manav Kasa Programı
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		final double armut= 2.14;
		final double elma= 3.67;
		final double domates= 1.11;
		final double muz= 0.95;
		final double patlican= 5.0;
		
		double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican, tutar;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Armut kaç kilo? ");
		kgArmut= input.nextDouble();
		
		System.out.print("Elma kaç kilo? ");
		kgElma= input.nextDouble();
		
		System.out.print("Domates kaç kilo? ");
		kgDomates= input.nextDouble();
		
		System.out.print("Muz kaç kilo? ");
		kgMuz= input.nextDouble();
		
		System.out.print("Patlıcan kaç kilo? ");
		kgPatlican= input.nextDouble();
		
		tutar= armut*kgArmut + elma*kgElma + domates*kgDomates + muz*kgMuz + patlican*kgPatlican;
		
		System.out.println("Toplam tutar: "+tutar);
	}

}
