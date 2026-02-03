/*Check if Two Strings Are Anagrams
Input: "listen", "silent"
Output: Yes*/


import java.util.Scanner;
import java.util.Arrays;

public class StringsAnagrams{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String str = sc.nextLine();
		
		System.out.println("Enter 2nd String");
		String ch = sc.nextLine();
		
		if(str.length() != ch.length()){
			System.out.println("Not Anagrams");
			return ;
		}
		
		char a[] = str.toCharArray();
		char b[] = ch.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean flag = true;
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("\nString is Anagrams");
		}else{
			System.out.println("\nStrin is Not Anagrams");
		}
	}
}

