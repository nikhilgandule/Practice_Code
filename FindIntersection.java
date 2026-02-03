/*Find Intersection of Two Arrays
Input: {1,2,3,4} & {3,4,5}
Output: 3 4
No collections*/

import java.util.Scanner;

public class FindIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter first array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter second array size");
        int m = sc.nextInt();
        int newarr[] = new int[m];

        System.out.println("Enter second array elements");
        for (int i = 0; i < m; i++) {
            newarr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;

            for (int j = 0; j < m; j++) {
                if (arr[i] == newarr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
