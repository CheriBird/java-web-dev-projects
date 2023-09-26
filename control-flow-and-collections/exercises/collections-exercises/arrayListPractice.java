import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 1, 6, 4, 8, 2, 0));
        System.out.println(nums);;
        System.out.println(sumEvens(nums));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Happy");
        wordList.add("days");
        wordList.add("are");
        wordList.add("here");
        wordList.add("again!");

        Scanner input = new Scanner(System.in);
        int wordLength;
        System.out.println("Enter the word length to search:");
        wordLength = input.nextInt();

        printFiveLetterWords(wordList, wordLength);

        // BONUS
        String limerick = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> limerickList = new ArrayList<String>(Arrays.asList(limerick.split(" ")));
        // for (String limerick: limerickList) {
        System.out.println(limerickList);
        printFiveLetterWords(limerickList, 4);

        input.close();

    }

    public static int sumEvens(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num: arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> arr, Integer wordLength) {
        for (String word: arr) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

}
