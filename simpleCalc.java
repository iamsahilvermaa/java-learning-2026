package java_roadmap;

import java.util.Scanner;

public class simpleCalc {
    static void main(String[] args) {

        System.out.println("-----Simple Calculator-----");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = sc.nextDouble();

        System.out.println("Enter operator(+, -, /, *): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number");
        double b = sc.nextDouble();

        int result = 0;

        switch(operator) {

            case '+':
                System.out.println("Result is " + (a+b));
            break;
            case '*':
                System.out.println("Result is " + (a*b));
                break;
            case '/':
                System.out.println("Result is " + (a/b));
                break;
            case '-':
                System.out.println("Result is " + (a-b));
                break;
        }

            }
        }


