import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int mat, turkce, kimya, fizik;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce= input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya= input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik= input.nextInt();
		
		double ortalama= (mat+fizik+turkce+kimya)/4.0;
		
		System.out.print("Notlarınızın ortalaması: "+ ortalama);
	}

}
