/**
 * Fonksiyonlar ile Hesap Makinesi Programı
 */
import java.util.Scanner;

public class Main {

	
	
	static void topla() {
		Scanner input= new Scanner(System.in);
		int result=0, i=1, number;
		
		while(true) {
			System.out.print(i++ +". sayıyı giriniz: ");
			number= input.nextInt();
			if(number==0) break;
			else result+=number;
		}
		
		System.out.println("Toplam: "+result);
	}
	
	static void cikart() {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen ilk sayıyı giriniz: ");
		int n1= input.nextInt();
		
		System.out.print("Lütfen ikinci sayıyı giriniz: ");
		int n2= input.nextInt();
		
		System.out.println(n1+"-"+n2+": "+ (n1-n2));
	}
	
	static void carp() {
		Scanner input= new Scanner(System.in);
		int result=1, i=1, number;
		
		while(true) {
			System.out.print(i++ +". sayıyı giriniz: ");
			number= input.nextInt();
			if(number==1) break;
			else if(number==0) result=0;
			else result*=number;
		}
		
		System.out.println("Çarpım: "+result);
	}
	static void bol() {
		Scanner input= new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz: ");
		double n1= input.nextDouble();
		
		System.out.print("İkinci sayıyı giriniz: ");
		double n2= input.nextDouble();
		
		System.out.println(n1+"/"+n2+": "+ (n1/n2));
	}
	
	static void usBul() {
		
		Scanner input= new Scanner(System.in);
		int result=1;
		
		System.out.print("Tabanı giriniz: ");
		int taban= input.nextInt();
		
		System.out.print("Üssü giriniz: ");
		int us= input.nextInt();
		
		if(taban==0 && us==0) System.out.println("Tanımsız!");
		else if(taban==0 && us!=0) System.out.println("Cevap: 0");
		else {
			for(int i=0; i<us; i++) result*= taban;
			System.out.println("Cevap: "+ result);
		}		
	}
	
	static void faktoriyel() {
		Scanner input= new Scanner(System.in);
		int result=1;
		
		System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
		int number= input.nextInt();
		
		if(number==0) System.out.println(number+" faktöriyel: "+ result);
		else if(number<0) System.out.println("Tanımsız!");
		else {
			for(int i=1; i<=number; i++) result*=i;
			System.out.println(number+" faktöriyel: "+ result);
		}
	}
	
	static void modAl() {
		Scanner input= new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz: ");
		int n1= input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz: ");
		int n2= input.nextInt();
		
		System.out.println(n1+"%"+n2+": "+ n1%n2);
	}
	
	static void alanCevre() {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
		int n1= input.nextInt();
		
		System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
		int n2= input.nextInt();
		
		System.out.println("Dikdörtgenin alanı: "+ n1*n2);
		System.out.println("Dikdörtgenin çevresi: "+ 2*(n1+n2));
			
	}
	

	
	
	
	
	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 20.09.2021
		 */
		
		
		Scanner input= new Scanner(System.in);
		int select;
		
		String menu="1-Toplama İşlemi\n"
				+ "2-Çıkarma İşlemi\n"
				+ "3-Çarpma İşlemi\n"
				+ "4-Bölme İşlemi\n"
				+ "5-Üslü Sayı Hesaplama\n"
				+ "6-Faktöriyel Hesaplama\n"
				+ "7-Mod Alma\n"
				+ "8-Dikdörtgen Alanı ve Çevre Hesabı\n"
				+ "0-Çıkış Yap";
		
		do {
			
			System.out.println(menu);
			System.out.print("Lütfen bir işlem seçiniz: ");
			select=input.nextInt();
			
			switch(select) {
			case 1:
				topla();
				break;
			case 2:
				cikart();
				break;
			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			case 5:
				usBul();
				break;
			case 6:
				faktoriyel();
				break;
			case 7:
				modAl();
				break;
			case 8:
				alanCevre();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlış bir değer girdiniz! Lütfen tekrar tuşlayınız..");
			}
			
			
		}while(select!=0);
		
		
		
	}

}


