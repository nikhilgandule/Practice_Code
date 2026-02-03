/*Rotate Array Left by K Positions
Input: {1,2,3,4,5}, k=2
Output: {3,4,5,1,2}*/

import java.util.Scanner;
public class RotateArrayLeft{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter k position");
		int k = sc.nextInt();
		
		k = k % n;
		
		int newarr[] = new int[arr.length];
		
		for(int i=0; i<k; i++){
			newarr[i] = arr[i];
		}
		
		for(int i=k; i<n; i++){
			arr[i - k] = arr[i];
		}
		
		for(int i=0; i<k; i++){
			arr[n - k + i] = newarr[i];
		}
		
		for(int x : arr){
			System.out.print(x+" ");
		}
	}
}
