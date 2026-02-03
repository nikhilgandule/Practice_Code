/*Move All Zeros to End

Input: {1,0,3,0,5}
Output: {1,3,5,0,0}
Without using extra array*/

import java.util.Scanner;
public class MoveAllZerosToEnd{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int j=0;
		for(int i=0; i<n; i++){
			if(arr[i] != 0){
				arr[j] = arr[i];
				j++;
			}
		}
		for(int i=j; i<n; i++){
			arr[i] = 0;
		}

		
		for(int x : arr){
			System.out.print(x+" ");
		}
	}
}