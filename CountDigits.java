package java_roadmap;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int n = sc.nextInt();


        while(n != 0){
            int digit = n % 10;
            n = n / 10;
            count++;
        }

        System.out.println("Total digits: " + count);
        sc.close();
    }
}
