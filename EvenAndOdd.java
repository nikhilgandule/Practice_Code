/*Segregate Even and Odd Numbers

Input: {1,2,3,4,5,6}
Output: {2,4,6,1,3,5}

Order does not matter*/

import java.util.Scanner;
public class EvenAndOdd{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = n - 1;
		
		while(left < right){
			if(arr[left] % 2 == 0){
				left++;
			}
			
		}
	}
}
