/**
 * Hesap Makinesi
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		
		int n1, n2, secim;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen sayıları giriniz: ");
		n1= input.nextInt();
		n2= input.nextInt();
		
		System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
		secim= input.nextInt();
		
		switch(secim) {
			
		case 1:
			System.out.print(n1+n2);
			break;
		case 2:
			System.out.print(n1-n2);
			break;
		case 3:
			System.out.print(n1*n2);
			break;
		case 4:
			System.out.print(n1/n2);
			break;
		default:
			System.out.println("Lütfen geçerli bir seçim yapınız.");
		}
		
	}

}
