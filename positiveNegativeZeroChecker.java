package java_roadmap;

import java.util.Scanner;

public class positiveNegativeZeroChecker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Negative number");
        }
            else if (a == 0) {
                System.out.println("Zero");
            }
            else {
                System.out.println("Positive");
            }
        }
    }

