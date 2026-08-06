package java_roadmap;

import java.util.Scanner;


public class name_and_age {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);
        sc.close();
    }
}
