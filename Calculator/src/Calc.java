/**
 * The Adding Calculator, Challenge 331 r/dailyprogrammer
 * @author  Ashlee Daniel
 *
 * Make a calculator that lets the user add, subtract, multiply and divide integers. It should allow exponents too. The user can only enter integers and must expect the result to be integers.
 * The twist is that YOU, the programmer, can only let the program calculate expressions using addition. Only addition. The user can enter 3*2 however you cannot calculate it using multiplication.
 * Basically, the programmer is not allowed to multiply, divide and subtract using the operations provided by a programming language.
 * To the programmer, the only accessible direct operation is addition.
 * Your calculator should be able to handle addition, subtraction, division, multiplication and exponents. No modulo operation (to obtain the remainder for two given operands) too.
 * Please note that:
 * You are not allowed to use any functions (other than user-defined functions) to work with exponents. Basically, don't cheat by allowing pre-defined functions from a library for the dirty work.
 * You can use logical operators.
 * The only binary arithmetic operator that you can use is + (addition).
 * The only unary operator that you can use is ++ (increment operator).
 * No bitwise operations are allowed.
 *
 * Input:
 * Allow the user to enter two integers and the operation symbol.
 * Let's use ^ for exponents i.e. 2^3 = 23 = 8
 *
 * Output:
 * If the answer is an integer, display the answer. If the answer is not an integer, display a warning message. Handle errors like 1/0 appropriately.
 *
 * Bonus:
 * Modify your program such that it works with decimals (except for ^ operation) with a minimum precision of 1 decimal place.
 */

import java.io.*;

public class Calc {

    public static Operations operations;
    /**
     * Default constructor
     */
    public Calc()
    {

    }

    public static void main(String[] args) {

    }




}
