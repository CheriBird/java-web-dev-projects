import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {

    // TODO Bonus and Super Bonus missions:
    /*
    Bonus Missions:
        Try these modifications on your code:
            1. Prompt the user to enter the string in the command line.
            2. Make the character counts case-insensitive.
            3. Exclude non-alphabetic characters.
    Super Bonus:
        Read the string in from a file.
    */

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        String charString = "If the product of two terms is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. So if you move all the terms over to " +
                "one side, you can put the quadratics into a form that can be factored allowing that " +
                "side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";

        char[] charactersInString = charString.toCharArray();
        HashMap<Character, Integer> chars_and_count = new HashMap<Character, Integer>();

        for (char character: charactersInString) {
            // loop through the string one character at a time
//            System.out.println(character);
            // check to see if char already exists
            if (chars_and_count.containsKey(character)) {
                chars_and_count.put(character, chars_and_count.get(character) + 1);
            }
            else { // for first occurrence of a character
                chars_and_count.put(character, 1);
            }

        }
        System.out.println(chars_and_count);

        // loop through the data structure to print the results (one character and count per line

        for (Map.Entry<Character, Integer> character: chars_and_count.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

//        scanner.close();

    }

}
