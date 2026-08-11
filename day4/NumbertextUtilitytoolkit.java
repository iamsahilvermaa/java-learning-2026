package java_roadmap.day4;

import java.util.Scanner;

public class NumbertextUtilitytoolkit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NumbertextUtilitytoolkit obj = new NumbertextUtilitytoolkit();

        while (true) {

            System.out.println("\n===== NUMBER & TEXT UTILITY TOOLKIT =====");
            System.out.println("1. Check Even/Odd");
            System.out.println("2. Check Prime");
            System.out.println("3. Factorial");
            System.out.println("4. Reverse Number");
            System.out.println("5. Palindrome Number");
            System.out.println("6. Sum of Digits");
            System.out.println("7. Find Maximum in Array");
            System.out.println("8. Find Minimum in Array");
            System.out.println("9. Sum of Array");
            System.out.println("10. Search in Array");
            System.out.println("11. Count Vowels");
            System.out.println("12. Reverse String");
            System.out.println("13. String Palindrome");
            System.out.println("14. Character Occurrence");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int evenOddNumber = sc.nextInt();

                    if (obj.isEven(evenOddNumber)) {
                        System.out.println(evenOddNumber + " is Even");
                    } else {
                        System.out.println(evenOddNumber + " is Odd");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    System.out.println(
                            primeNumber + " is Prime: "
                                    + obj.isPrime(primeNumber)
                    );
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int factorialNumber = sc.nextInt();

                    System.out.println(
                            "Factorial = "
                                    + obj.factorial(factorialNumber)
                    );
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int reverseNumber = sc.nextInt();

                    System.out.println(
                            "Reverse = "
                                    + obj.reverseNumber(reverseNumber)
                    );
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int palindromeNumber = sc.nextInt();

                    if (obj.isPalindrome(palindromeNumber)) {
                        System.out.println(
                                palindromeNumber + " is a Palindrome"
                        );
                    } else {
                        System.out.println(
                                palindromeNumber + " is not a Palindrome"
                        );
                    }
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int digitNumber = sc.nextInt();

                    System.out.println(
                            "Sum of digits = "
                                    + obj.sumDigits(digitNumber)
                    );
                    break;

                case 7:
                    int[] maxArray = inputArray(sc);

                    System.out.println(
                            "Maximum = "
                                    + obj.findMaximum(maxArray)
                    );
                    break;

                case 8:
                    int[] minArray = inputArray(sc);

                    System.out.println(
                            "Minimum = "
                                    + obj.findMinimum(minArray)
                    );
                    break;

                case 9:
                    int[] sumArray = inputArray(sc);

                    System.out.println(
                            "Array Sum = "
                                    + obj.arraySum(sumArray)
                    );
                    break;

                case 10:
                    int[] searchArray = inputArray(sc);

                    System.out.print("Enter the number to search: ");
                    int target = sc.nextInt();

                    if (obj.search(searchArray, target)) {
                        System.out.println(target + " found in array");
                    } else {
                        System.out.println(target + " not found in array");
                    }
                    break;

                case 11:
                    sc.nextLine();

                    System.out.print("Enter a string: ");
                    String vowelString = sc.nextLine();

                    System.out.println(
                            "Number of vowels = "
                                    + obj.countVowels(vowelString)
                    );
                    break;

                case 12:
                    sc.nextLine();

                    System.out.print("Enter a string: ");
                    String reverseString = sc.nextLine();

                    System.out.println(
                            "Reverse = "
                                    + obj.reverseString(reverseString)
                    );
                    break;

                case 13:
                    sc.nextLine();

                    System.out.print("Enter a string: ");
                    String palindromeString = sc.nextLine();

                    if (obj.stringPalindrome(palindromeString)) {
                        System.out.println("String is a Palindrome");
                    } else {
                        System.out.println("String is not a Palindrome");
                    }
                    break;

                case 14:
                    sc.nextLine();

                    System.out.print("Enter a string: ");
                    String occurrenceString = sc.nextLine();

                    System.out.print("Enter a character: ");
                    char character = sc.nextLine().charAt(0);

                    System.out.println(
                            "Occurrence = "
                                    + obj.characterOccurrences(
                                    occurrenceString,
                                    character
                            )
                    );
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Array input helper method
    public static int[] inputArray(Scanner sc) {

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public int reverseNumber(int n) {

        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            n = n / 10;

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

    public boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        int original = n;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;

            n = n / 10;

            reverse = reverse * 10 + digit;
        }

        return original == reverse;
    }

    public int sumDigits(int n) {

        int sum = 0;

        while (n != 0) {

            sum = sum + n % 10;

            n = n / 10;
        }

        return sum;
    }

    public int findMaximum(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public int arraySum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public boolean search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public int countVowels(String s) {

        int count = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a'
                    || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {

                count++;
            }
        }

        return count;
    }

    public String reverseString(String s) {

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        return reverse;
    }

    public boolean stringPalindrome(String s) {

        String reverse = reverseString(s);

        return reverse.equals(s);
    }

    public int characterOccurrences(String s, char c) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }
}