/**
 * Uçak Bileti Hesaplayan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 15.09.2021
		 */
		double mesafe=0, toplamUcret=0, kmUcret=0.10;
		int yas=0, tekYon = 0;
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen yaşınızı giriniz: ");
		int temp= input.nextInt();
		if(temp<=0) {
			System.out.println("Hatalı veri girdiniz!");
			System.exit(0);
		}
		else
			yas=temp;
		
		System.out.print("Lütfen tek yön mesafeyi giriniz: ");
		double temp2= input.nextDouble();
		if(temp2<=0) {
			System.out.println("Hatalı veri girdiniz!");
			System.exit(0);
		}
		else
			mesafe= temp2;
		
		System.out.print("Tek yön ise 1, gidiş dönüş ise 2 tuşlayınız: ");
		int temp3= input.nextInt();
		if(temp3==1 || temp3==2) {
			tekYon= temp3;
		}
		else {
			System.out.println("Hatalı veri girdiniz!");
			System.exit(0);
		}
		
		if(tekYon==2)
			toplamUcret= mesafe*kmUcret*2;
		else
			toplamUcret= mesafe*kmUcret;
		
		if(yas <12)
			toplamUcret= toplamUcret/2;
		else if(yas>=12 && yas<24)
			toplamUcret= toplamUcret*0.9;
		else if(yas>65)
			toplamUcret= toplamUcret*0.7;
		
		if(tekYon==2)
			toplamUcret= toplamUcret*0.8;
		
		
		System.out.println("Ödemeniz gereken toplam ücret= "+ toplamUcret);
		
	}

}
