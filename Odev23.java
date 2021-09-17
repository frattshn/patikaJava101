/**
 * Min ve Max Uygulaması
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 17.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		int sayi, max=0, min=0;
		
		System.out.print("Kaç adet sayı gidereksiniz: ");
		int n=input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i+". sayıyı giriniz: ");
			
			sayi=input.nextInt();
            if (i==1){
                    max=sayi;
                    min=sayi;
            }
            if (sayi>max){
                    max=sayi;
            }
            if(sayi<min){
            min=sayi;
            }
			
		}
		
		System.out.println("max : "+max);
    System.out.println("min : "+min);		
	}

}


