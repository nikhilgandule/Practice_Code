/*Find Longest Word in a Sentence

Input: "Java is very powerful"
Output: powerful*/


import java.util.Scanner;
public class LongestWord{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence");
		String ch = sc.nextLine();
		
		String []str = ch.trim().split(" ");
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<str.length; i++){
			if(str[i].length() > max){
				max = str[i].length();
				index = i;
			}
		}
		System.out.println(str[index]);
	}
}