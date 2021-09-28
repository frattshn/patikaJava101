/**
 * Sayı Tahmin Oyunu
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 28.09.2021
		 */	
		
		Random rand= new Random();
		int number= rand.nextInt(100); //0-100 arası rastgele bir sayı
		
		Scanner input= new Scanner(System.in);
		int right=0, selected;
		int[] wrong= new int[5];
		boolean isWin= false;
		
		while(right<5) {
			System.out.println("Lütfen tahmininizi giriniz: ");
			selected= input.nextInt();
			if(selected<0 || selected>99) {
				System.out.println("Lütfen 0-100 arası bir değer giriniz.");
				continue;
			}
			if(selected== number) {
				System.out.println("Tebrikler doğru tahmin! Tahmin ettiğin sayı : "+ number);
				isWin= true;
				break;
			}else {
				wrong[right++]= selected;
				System.out.println("Hatalı bir sayı girdiniz!");
				if(selected>number) {
					System.out.println(selected+" sayısı, gizli sayıdan büyüktür.");
				}else {
					System.out.println(selected+" sayısı, gizli sayıdan küçüktür.");
				}
				System.out.println("Kalan hakkınız : "+ (5-right));
			}			
		}
		
		if(!isWin) {
			System.out.println("Kaybettiniz ! ");
			System.out.println("Tahminleriniz : "+ Arrays.toString(wrong));
		}
		
		
	}
}
