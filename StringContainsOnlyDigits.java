/*Check if String Contains Only Digits

Input: "12345" → Yes
Input: "12a45" → No*/


import java.util.Scanner;
public class StringContainsOnlyDigits{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		
		boolean flag = true;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i) > '9'){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}