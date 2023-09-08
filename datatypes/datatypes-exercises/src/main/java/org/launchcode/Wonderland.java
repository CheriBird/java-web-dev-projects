package org.launchcode;

import java.util.Scanner;

public class Wonderland {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        Boolean found = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search text:");
        String SearchText = input.nextLine();

        System.out.println("You searched for: " + SearchText);
        if (quote.toLowerCase().contains(SearchText.toLowerCase())) {
            System.out.println("Search text '" + SearchText + "' was found!");
            // print out the index within the string and its length
            int location = quote.toLowerCase().indexOf(SearchText.toLowerCase());
            int searchLength = SearchText.length();
            System.out.println("Search text '" + SearchText + "' is " + searchLength + " characters long and was found at index " + location + ".");
            // Remove the word from the string and print the sentence again
            String newQuote = quote.substring(0, location) + quote.substring(location + searchLength);
            System.out.println(newQuote);

            System.out.println("\nReplace method used:");
            String newQuote2 = quote.replace(SearchText, "");
            System.out.println(newQuote2);
        } else {
            System.out.println("Search text " + SearchText + " was not found.");
        }
    }
}
