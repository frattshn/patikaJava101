/**
 * Arrays Sınıfı
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 27.09.2021
		 */
		
		/*
		 * Arrays sınıfının metotları static olduğu için
		 * herhangi bir nesne üretmeden bu metotlara ulaşabiliriz.
		 */
		
		int[] list= {1,2,3,4,5,6,7};
		double[] list2= {1.5, 1.6, 5.8};
		
		//toString
		System.out.println("List: "+Arrays.toString(list));
		System.out.println("List2: "+Arrays.toString(list2));
		
		//fill
		int[] list3= {1, 5, 6, 2, 4};
		Arrays.fill(list3, 10);
		System.out.println("List3: "+Arrays.toString(list3));
		
		//sort
		double[] list4= {1.5, 0.3, 6.8, 1.7};
		Arrays.sort(list4);
		System.out.println("List4: "+Arrays.toString(list4));
		
		//binarySeacrh
		System.out.println("6'nın indeksi: "+Arrays.binarySearch(list, 6));
		
		//copyOf ve copyOfRange
		int[] copyOfList= Arrays.copyOf(list, 3);
		int[] copyOfRangeList= Arrays.copyOfRange(list,1 , 3);
		
		//equals
		System.out.println(Arrays.equals(list, list3));
		
	}
}
