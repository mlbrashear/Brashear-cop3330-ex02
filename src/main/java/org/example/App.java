package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);

        //Ask user for string
        System.out.println("What is the input string?");
        input = sc.next();

        //Create integer that counts the number of characters in the sting
        int length = input.length();

        //Print out findings
        System.out.println(input + " has " + length + " characters.");

        sc.close();
    }
}