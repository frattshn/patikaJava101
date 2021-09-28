/**
 * Dizideki Elemanları Sıralayan Program
 */

package patikaJava101;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	
	static void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void main(String[] args) {
		/**
		 * @author MEMDUH FIRAT 28.09.2021
		 */	
				
		Scanner input= new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n : ");
		int n= input.nextInt();
		
		int[] array= new int[n];
		

		
		for(int i=0; i<array.length; i++) {
			System.out.print((i+1)+". Elemanı : ");
			array[i]= input.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		sort(array);
		System.out.print("Sorted Array : ");
		System.out.print(Arrays.toString(array));
		
		
	}
}
