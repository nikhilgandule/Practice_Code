/*Find Missing Number in an Array (1 to n)
Example: {1,2,4,5} → Missing = 3*/

import java.util.Scanner;
public class MissingNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter Values");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		//sort Array
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<n-1; i++){
			int start = arr[i];
			int end = arr[i+1];
			
			for(int j=start+1; j<end; j++){
				System.out.print(j+" ");
			}
		}
	}
}