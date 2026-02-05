/*Reverse Each Word in a Sentence
Input: "Java is powerful"
Output: "avaJ si lufrewop"*/

import java.util.Scanner;
public class ReverseWordSentence{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		
		String strarr[] = str.split(" ");
		
		String rev ="";
		
		for(int i=0; i<strarr.length; i++){
			String revword = "";
			
			for(int j=strarr[i].length()-1; j>=0; j--){
				
				revword = revword + strarr[i].charAt(j);
			}
			rev = rev + revword+" ";
		}
		System.out.println(rev);
	}
}