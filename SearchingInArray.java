package java_roadmap;

import java.util.Scanner;

//linear Searching
public class SearchingInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
