/*Find First Duplicate Element in Array

Input: {1,2,3,2,4}
Output: 2*/

import java.util.Scanner;
public class FirstDuplicateElement{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter value");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		
		for(int i=0; i<n && !found; i++){
			
			boolean flag = true;
			
			for(int j=0; j<i; j++){
				if(arr[i] == arr[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				for(int j=i+1; j<n; j++){
					if(arr[i] == arr[j]){
						System.out.println(arr[i]);
						found = true;
						break;
					}
				}
			}
		}
	}
}