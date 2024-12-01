package com.teachmeskills.lesson_17.task_1.computation;

import com.teachmeskills.lesson_17.task_1.exception.CustomException;
import com.teachmeskills.lesson_17.task_1.interfaces.MyFunctionalInterface;

import java.math.BigInteger;
import java.util.Scanner;

public class Logic {

    public void Input() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a digit (1 is the reverse of the string, 2 is the factorial of the number):");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                MyFunctionalInterface<String, String> reverseString = (input) -> new StringBuilder(input).reverse().toString();
                System.out.println("Enter the line for the reverse:");
                String inputString = scanner.nextLine();
                String reversedString = reverseString.execute(inputString);
                System.out.println("The reverse of the line: " + reversedString);

            } else if (choice == 2) {
                MyFunctionalInterface<Integer, BigInteger> factorial = (input) -> {
                    if (input < 0) {
                        throw new CustomException("The factorial is not defined for negative numbers.");
                    }
                    BigInteger result = BigInteger.ONE;
                    for (int i = 1; i <= input; i++) {
                        result = result.multiply(BigInteger.valueOf(i));
                    }
                    return result;
                };

                System.out.println("Enter an integer to find the factorial:");
                int inputNumber = Integer.parseInt(scanner.nextLine());
                BigInteger factorialResult = factorial.execute(inputNumber);
                System.out.println("The factorial of the number: " + inputNumber + " равен: " + factorialResult);
            } else {
                System.out.println("Incorrect input. Please enter 1 or 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: No number was entered.");
        } catch (CustomException e) {
            System.out.println("Mistake: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error has occurred: " + e.getMessage());
        }
    }
}