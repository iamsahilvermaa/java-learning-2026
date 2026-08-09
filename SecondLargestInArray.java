package java_roadmap;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (max > arr[i] && arr[i] > secondlargest) {
                secondlargest = arr[i];

            }
        }

        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest value");
        } else {
            System.out.println("The second largest number is " + secondlargest);
        }

        sc.close();

    }
}
