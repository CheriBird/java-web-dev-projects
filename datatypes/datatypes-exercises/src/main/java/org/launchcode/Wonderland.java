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

        // prompt user for a term to search for within the string
        Scanner searchTxt = new Scanner(System.in);
        System.out.println("Enter the search text:");
        String txt = searchTxt.nextLine();

//      Make search case-insensitive
        boolean result = quote.toLowerCase().contains(txt.toLowerCase());

//        print whether the search term was found
        if (result) {
            System.out.println("'" + txt + "' was found in the Wonderland text: " + result);

            // Print the index and length of where the text was found
            int location = quote.toLowerCase().indexOf(txt.toLowerCase());
            int length = txt.length();
            System.out.println("Search text '" + txt + "' starts at character: " + (location + 1) + " and" +
                    " is " + length + " characters.");

            // Remove the word/text from the main string and print the sentence
            System.out.println(quote.substring(location + length));
            String newQuote = quote.substring(0, location) + quote.substring(location + length);
            System.out.println("The revised sentence is:\n" + newQuote);

//            System.out.println("\nReplace method used:");   // this replaces ALL occurrences; not just the first one
//            String newQuote2 = quote.replace(txt, "");
//            System.out.println(newQuote2);

        } else {
            System.out.println("'" + txt + "' was not found in the Wonderland text.");
        }
    }
}
