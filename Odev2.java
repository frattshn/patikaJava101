import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double para;
		double kdv= 0.18;
		double kdv2= 0.08;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen fiyatı giriniz: ");
		para=input.nextDouble();
		
		if(para>0 && para<1000) {
			double tutar= para*kdv;
			para+= para*kdv;
			System.out.println("KDV'li fiyatı: "+para);
			System.out.println("KDV tutarı: "+ tutar);
		}
		if(para>=1000) {
			double tutar= para*kdv2;
			para+= para*kdv2;
			System.out.println("KDV'li fiyatı: "+para);
			System.out.println("KDV tutarı: "+tutar);
		}
		
	}

}
