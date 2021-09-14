import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int a, b, c;
		double alan, u;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Lütfen kenar uzunluklarını girin: ");
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		
		u= (a+b+c)/2;
		alan= u*(u-a)*(u-b)*(u-c);
		alan= Math.sqrt(alan);
		
		System.out.println("Üçgenin alanı: "+alan);
	}

}
