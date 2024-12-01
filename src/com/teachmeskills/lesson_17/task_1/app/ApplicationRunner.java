package com.teachmeskills.lesson_17.task_1.app;

import com.teachmeskills.lesson_17.task_1.computation.Logic;

/** Create a generalized functional interface.
 * Write a class with a single method.
 * In this method, implement the logic:

 - if the number 1 is entered into the console, then:

 * use the interface with a string type and pass the logic
 * of string reversal (output of the string in reverse order)
 * to the interface method.

 - if the number 2 is entered into the console, then:

 * use the interface with an integer type and pass the logic
 * of finding the factorial of the number to the interface method.
 */

 public class ApplicationRunner {

    public static void main(String[] args) {
        Logic logicHandler = new Logic();
        logicHandler.Input();
    }
}