/*Check if Array is Palindrome

Input: {1,2,3,2,1}
Output: Yes*/


import java.util.Scanner;
public class ArrayPalindrome{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter value");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = n-1;
		boolean flag = true;
		
		while(left < right){
			if(arr[left] != arr[right]){
				flag = false;
				break;
			}
			left++;
			right--;
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
