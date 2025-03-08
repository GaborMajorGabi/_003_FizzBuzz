package main;

public class FizzBuzz2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}

/**
 * * * Subtask 2
* * Let the class be named FizzBuzz2. The program writes the following labels to a part of the numbers (rows):
* * if the number is divisible by 3, write Fizz next to it
* * if the number is divisible by 5, write Buzz next to it
* * if the number is divisible by both 3 and 5, write Fizz Buzz next to it
* * Before you write the program, think about whether it cannot be solved simply with conditional statements,
* * Write a FizzBuzz1.
 */
