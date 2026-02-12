/*Find the Maximum Sum Subarray

Input: {-2 1 -3 4 -1 2 1 -5 4}
Output: 6
(subarray: {4,-1,2,1})*/


import java.util.Scanner;
public class MaximumSum{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++){
			sum = sum + arr[i];
			
			if(sum > max){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}
		System.out.println(max);
	}
}
