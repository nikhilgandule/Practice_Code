/*Find Duplicate Characters in a String
Example: "programming"*/

import java.util.Scanner;
public class DuplicateCharacters{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			boolean flag = false;
			
			for(int j=0; j<i;  j++){
				
				if(ch == str.charAt(j)){
					flag = false;
					break;
				}
			}
			
			for(int j=i+1; j<str.length(); j++){
				if(ch == str.charAt(j)){
					flag = true;
					break;
				}
			}
			if(flag){
				System.out.print(ch+" ");
			}
		}		
	}
}
