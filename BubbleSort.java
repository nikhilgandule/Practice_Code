/*   Sort an Array (Bubble Sort)
o   Write a class to implement a method to sort an integer array using bubble sort.
 Explanation: Learn basic sorting algorithms and their implementation.*/
 
import java.util.*;
public class BubbleSort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Array Elements");
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		Sort s = new Sort();
		s.getSort(a);
	}
}

class Sort{
	void getSort(int ... a){
		
		for(int i=0; i<a.length -1; i++){
			
			for(int j=0; j<a.length - i -1; j++){
				
				if(a[j] > a[j + 1]){
					
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array:");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}