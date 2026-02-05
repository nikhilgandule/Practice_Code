/*Remove All Spaces from a String

Input: "Java is easy"
Output: "Javaiseasy"*/


import java.util.Scanner;
public class RemoveAllSpaces{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		
		String r ="";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != ' '){
				r = r + str.charAt(i);
			}
		}
		System.out.println(r);
	}
}