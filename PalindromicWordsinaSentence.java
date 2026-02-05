/*Find All Palindromic Words in a Sentence

Input: "madam level java civic"
Output: madam level civic*/


import java.util.Scanner;
public class PalindromicWordsinaSentence{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
		
		String arr[] = str.split("\\s+");
		
		for(int i=0; i<arr.length; i++){
			
			String word = arr[i];
			boolean flag = true;
			
			int left = 0;
			int right = word.length()-1;
			
			while(left < right){
				if(word.charAt(left) != word.charAt(right)){
					flag = false;
					break;
				}
				left++;
				right--;
			}
			
			if(flag){
				System.out.print(word+" ");
			}
		}
	}
}