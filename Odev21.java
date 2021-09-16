/**
 * Bankamatik Uygulaması
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 16.09.2021
		 */
		
		Scanner input= new Scanner(System.in);
		
		String userName, password;
		int right=3, balance=1500, select;
		
		while(right>0) {
			System.out.print("Kullanıcı adınızı giriniz: ");
			userName= input.nextLine();
			System.out.print("Şifrenizi giriniz: ");
			password= input.nextLine();
			
			System.out.println();
			
			if(userName.equals("patika")&&password.equals("dev123")) {
				System.out.println("Merhaba Kodluyoruz Bankasına Hoş Geldiniz!");
				do {
					System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
					System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
					select= input.nextInt();
					
					if(select==1) {
						System.out.print("Para miktarı: ");
						int price= input.nextInt();
						balance+= price;
					}else if(select==2) {
						System.out.print("Para miktarı: ");
						int price= input.nextInt();
						if(price>balance)
							System.out.println("Yetersiz bakiye!");
						else
							balance-=price;
					}else if(select==3)
						System.out.println("Bakiyeniz: "+balance);					
				}while(select !=4);
				System.out.println("Tekrar görüşmek üzere!");					
				break;
			}else {
				right--;
				if(right==0)
					System.out.println("Hesabınız bloke olmuştur.");
				else
					System.out.println("Yanlış kullanıcı adı veya parola! Kalan hakkınız: "+right);				
			}
		}
		
	}

}


