package main;

public class FizzBuzz3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.printf("%3d Fizz Buzz%n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%3d Fizz%n", i);
            } else if (i % 5 == 0) {
                System.out.printf("%3d Buzz%n", i);
            } else {
                System.out.printf("%3d%n", i);
            }
        }

    }
}

/**
 *  * * Subtask 3
 * * The name of the class should be FizzBuzz3. The program should work like FizzBuzz2, except that
 * * the numbers should be written one below the other with the correct place value. Since the largest number to be
 * displayed is 100, the numbers printed
 * * should be 3 characters wide.
 */
