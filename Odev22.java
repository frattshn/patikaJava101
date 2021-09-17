/**
 * EBOB EKOK Bulan Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 17.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		int ebob=1, ekok=1;
		
		System.out.print("Sayıları giriniz: ");
		int n1= input.nextInt();
		int n2= input.nextInt();
		
		for(int i=1; i<=n1; i++) {
			if(n1%i==0 && n2%i==0)
				ebob=i;
		}
		System.out.println("Ebob "+n1+" "+n2+": "+ebob);
		
		
		for(int k=n1; k>=1; k--) {
			if(n1%k==0 && n2%k==0) {
				ebob=k;
				System.out.println("Ebob "+n1+" "+n2+": "+ebob);
				break;// bulunan sayıdan daha küçük ebob bulunmaması için
			}
		}
		
		
		System.out.print("Sayıları giriniz: ");
		int a1= input.nextInt();
		int a2= input.nextInt();
		
		for(int i=1; i<=(a1*a2); i++) {
			if(i%a1==0 && i%a2==0)
				ekok=i;
		}
		System.out.println("Ekok "+a1+" "+a2+": "+ekok);
		
		
		
	}

}


