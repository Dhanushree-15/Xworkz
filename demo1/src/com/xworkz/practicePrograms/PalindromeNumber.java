package com.xworkz.practicePrograms;
import java.util.Scanner;

    public class PalindromeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to check if it's a palindrome: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome!");
            } else {
                System.out.println(number + " is not a palindrome.");
            }

            scanner.close();
        }

        public static boolean isPalindrome(int number) {
            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            return original == reversed;
        }
    }


