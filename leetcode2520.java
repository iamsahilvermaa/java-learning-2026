package java_roadmap;

import java.util.Scanner;

class Solution {
    static int countAndDivide(int n) {
        int count = 0;

        int n1 = 0;
        n1 = n;


        while (n1 != 0) {
            int digit = n1 % 10;
            n1 = n1 / 10;
            if (digit != 0 && n % digit == 0) {
                count++;

            }
        }
        return count;
    }
}

public class leetcode2520 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Output: " + Solution.countAndDivide(n));
    }
}
