/*Check if Array is Sorted
Input: {1,2,3,4}
Output: Yes
Ascending order check*/

import java.util.Scanner;
public class ArrayisSorted{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean flag = false;
		
		for(int i=0; i<n-1; i++){
			
			if(arr[i] > arr[i+1]){
				flag = true;
				break;
			}
		}
		
		if(!flag){
			System.out.println("Sorted");
		}else{
			System.out.println("Unsorted");
		}
	}
}
