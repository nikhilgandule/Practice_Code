//Check if String is Palindrome

import java.util.Scanner;
public class PalindromeString{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		int left = 0;
		int right = str.length()-1;
		
		boolean flag = false;
		
		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				flag = true;
				break;
			}
			left++;
			right--;
		}
		
		if(!flag){
			System.out.println("String is Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}