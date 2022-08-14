package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // type casting
        /* int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double also called widening casting  smaller type to larger type

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0 */

        // Narrowing Casting
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9

    }
}
