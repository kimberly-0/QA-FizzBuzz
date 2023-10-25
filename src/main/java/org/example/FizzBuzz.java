package org.example;

import java.util.Scanner;

public class FizzBuzz {

    public static void fizzBuzz(int max) {
        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a maximum");
        int max = scanner.nextInt();

        FizzBuzz.fizzBuzz(max);

        scanner.close();
    }
}