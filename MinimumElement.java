package java_roadmap;

import java.util.Scanner;

public class MinimumElement {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of elements you want to enter:");
            int n = sc.nextInt();

            int[] arr = new int[n];


            System.out.println("Enter the elements you want to enter: ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int min = arr[0];

            for(int i = 0; i < n; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            System.out.println("Minimum element is: " + min);
            sc.close();

        }
    }


