/*
UCF COP 3330 Fall 2021 Assignment 2 Solution
Copyright 2021 Cole Castille
 */

// Prompt user "What is the quote?"
// Use first scanner to get string Quote
// Prompt user "Who said it?"
// Use second scanner to get string Author
// Use concatenation to print "<Author> says, <Quote>"

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner s1 = new Scanner(System.in);
        String quote = s1.nextLine();
        System.out.print("Who said it? ");
        Scanner s2 = new Scanner(System.in);
        String author = s2.nextLine();
        System.out.print(author + " says, " + "\"" + quote + "\"");
    }
}
