/**
 * Kullanıcı Girişi Kontrol Eden Program
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * @author MEMDUH FIRAT 14.09.2021
		 */
		final String orgUserName="frattshn";
		final String orgPassword="parola123";
		String userName, password;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen kullanıcı adınızı giriniz: ");
		userName= input.nextLine();
		
		System.out.print("Lütfen şifrenizi giriniz: ");
		password= input.nextLine();
		
		if(userName.equals(orgUserName) && password.equals(orgPassword))
			System.out.println("Girdiğiniz bilgiler doğru!");
		else {
			System.out.println("Girdiğiniz kullanıcı adı veya parola geçersiz!");
			System.out.print("Şifrenizi sıfırlamak ister misiniz? y/n");
			String c;
			c= input.nextLine();
			switch(c) {
				case "y":
					System.out.print("Lütfen yeni şifrenizi giriniz: ");
					String password2;
					password2= input.nextLine();
					if(password2.equals(orgPassword))
						System.out.print("Eski şifreniz yenisi ile aynı olamaz!");
					else {
						password=password2;
						System.out.println("Yeni şifreniz oluşturuldu!");
					}
					break;
				case "n":
					System.out.println("Giriş sağlanamadı!");
			}
		}
		
	}
