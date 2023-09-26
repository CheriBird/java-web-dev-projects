import java.util.Arrays;
import java.util.regex.Pattern;

public class splitArray {

    public static void main(String[] args) {

        String limerick = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        // string split at the spaces
        String[] limerickArray = limerick.split(" ");
        System.out.println("Array split with spaces:");
        for (String word: limerickArray) {
            System.out.println(word);
        }
        // alternate, one-line printed array
        System.out.println(Arrays.toString(limerickArray));

        // string split at the periods for sentences
        String[] limerickArray2 = limerick.split("[.]");
        System.out.println("\n\nArray split bracketing with periods:");
        for (String word: limerickArray2) {
            System.out.println(word);
        }
        // alternate, one-line printed array
        System.out.println(Arrays.toString(limerickArray2));

        // string split (Pattern) at the periods for sentences
        String[] limerickArray3 = limerick.split(Pattern.quote("."));
        System.out.println("\n\nArray split (Pattern) with periods:");
        for (String word: limerickArray3) {
            System.out.println(word);
        }

        // string split (with \\.) at the periods for sentences
        String[] limerickArray4 = limerick.split("\\.");
        System.out.println("\n\nArray split (with slashes) at periods:");
        for (String word: limerickArray4) {
            System.out.println(word);
        }

    }
}
