/*Replace All Even Numbers with 0

Input: {1,2,3,4,5}
Output: {1,0,3,0,5}*/


import java.util.Scanner;
public class ReplaceEvenNumbers{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter value");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(arr[i] % 2 == 0){
				arr[i] = 0;
			}
		}
		
		for(int x : arr){
			System.out.print(x+" ");
		}
	}
}