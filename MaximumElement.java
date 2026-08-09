package java_roadmap;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to enter:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int max = arr[0];

        System.out.println("Enter the elements you want to enter: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        sc.close();

    }
}
