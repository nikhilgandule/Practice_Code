//Find Duplicate Elements

import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElement{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Elements");
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(a[k] + " ");
        }
    }
}