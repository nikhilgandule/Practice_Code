/*Find Sum of Elements at Even Index

Input: {10,20,30,40}
Output: 10 + 30 = 40*/

import java.util.Scanner;
public class SumOFEvenIndex{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter value");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++){
			if(i%2 == 0){
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}