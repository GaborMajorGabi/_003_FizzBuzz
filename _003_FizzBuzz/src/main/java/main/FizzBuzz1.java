package main;

public class FizzBuzz1 {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        for (start = 1; start <= end; start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println(start + " -> divisible with 15");
            } else if (start % 3 == 0) {
                System.out.println(start + " -> divisible with 3");
            } else if (start % 5 == 0) {
                System.out.println(start + " -> divisible with 5");
            } else {
                System.out.println(start + " ");
            }
        }
    }
}

/**
 * * Write Java programs that print the integers from 1 to 100 to the standard output, labeling them
 * * with certain labels. Let the IDE project be named _03_FizzBuzz.
 * *
 * * The programs print the numbers in order, each on a separate line. On a given line, the labels are separated from
 * * the number and a space.
 * *
 * * Subtask 1
 * * Let the class be named FizzBuzz1. The program writes the following labels to a portion of the numbers (lines):
 * *
 * * if the number is divisible by 3, it says divisible by 3
 * * if the number is divisible by 5, it says divisible by 5
 * * if the number is divisible by both 3 and 5, it says divisible by 15
 * *
 * * Subtask 2
 * * Let the class be named FizzBuzz2. The program writes the following labels to a part of the numbers (rows):
 * * if the number is divisible by 3, write Fizz next to it
 * * if the number is divisible by 5, write Buzz next to it
 * * if the number is divisible by both 3 and 5, write Fizz Buzz next to it
 * * Before you write the program, think about whether it cannot be solved simply with conditional statements,
 * * Write a FizzBuzz1.
 * *
 * * Subtask 3
 * * The name of the class should be FizzBuzz3. The program should work like FizzBuzz2, except that
 * * the numbers should be written one below the other with the correct place value. Since the largest number to be displayed is 100, the numbers printed
 * * should be 3 characters wide.
 */
