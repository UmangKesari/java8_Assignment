import java.util.function.Predicate;

class Sentence {
    public static boolean isWordOfFiveLetter(String str) {
        if (str.length() == 5) {
            return true;
        }
        return false;
    }

    public static String findWordsOfFiveLetter(String sentence, Predicate<String> predicate) {

        String[] arr = sentence.split(" ");
        String str = "";
        for (String s : arr) {
            if (isWordOfFiveLetter(s)) {
                str += s;
            }
        }
        return str;
    }
}


public class MethodReferenceDemo {
    public static void main(String[] args) {
        String s = "Sun rises from the East";
        String ans;
        //Using lambda

        ans = Sentence.findWordsOfFiveLetter(s, (checkWord) -> Sentence.isWordOfFiveLetter(checkWord));
        System.out.println(ans);

        //Using static method inference
        ans = Sentence.findWordsOfFiveLetter(s, Sentence::isWordOfFiveLetter);
        System.out.println(ans);

    }
}
