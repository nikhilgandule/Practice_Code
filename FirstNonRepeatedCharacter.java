/*Find First Non-Repeated Character in a String
Example: "swiss" → Output: w*/

import java.util.Scanner;
public class FirstNonRepeatedCharacter{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++){
			
			boolean flag = false;
			
			//chek before i
			for(int j=0; j<i; j++){
				if(str.charAt(i) == str.charAt(j)){
					flag = true;
					break;
				}
			}
			
			//chek after i
			for(int j=i+1; j<str.length() && !flag ; j++){
				if(str.charAt(i) == str.charAt(j)){
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
