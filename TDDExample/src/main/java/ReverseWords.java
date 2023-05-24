import java.util.*;

public class ReverseWords {

    public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}