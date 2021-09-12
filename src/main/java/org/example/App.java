/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int l = keyboardInput.nextInt();

        System.out.print("What is the width of the room in feet? ");
        int width = keyboardInput.nextInt();

        System.out.println("You entered dimensions of " + l + " feet by " + width + " feet.");
        System.out.println("The area is " );
        System.out.println( (l * width) + " square feet");
        System.out.println( ( ( l * width) * 0.09290304) + " square meters.");


    }
}
