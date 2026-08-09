package java_roadmap;

import java.util.Scanner;

public class EvenOddCountInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size  of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                found = true;
                countEven++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                found = true;
                countOdd++;
            }
        }
        System.out.println("Even numbers are " + countEven);
        System.out.println("Odd numbers are " + countOdd);

        sc.close();
    }
}
