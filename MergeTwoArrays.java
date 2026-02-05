/*Merge Two Arrays (Without Sorting)

Input: {1,2} & {3,4}
Output: {1,2,3,4}*/


import java.util.Scanner;
public class MergeTwoArrays{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eter 1st size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter 1st array values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Eter 2nd size");
		int m = sc.nextInt();
		
		int arr2[] = new int[m];
		System.out.println("Enter 2nd arrys values");
		
		for(int i=0; i<m; i++){
			arr2[i] = sc.nextInt();
		}
		
		int merge[] = new int[arr.length + arr2.length];
		int j = 0;
		
		for(int i=0; i<n; i++){
			merge[j++] = arr[i];
		}
		for(int i=0; i<m; i++){
			merge[j++] = arr2[i];
		}
		
		for(int x : merge){
			System.out.print(x+" ");
		}
	}
}