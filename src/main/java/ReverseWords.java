
import java.util.*;


public class ReverseWords {

    public static void main(String[] args) {
        String str = "..geeks..for.geeks";

        List<String> words = new ArrayList<String>();
        String[] parts = str.split("\\.");

        for(String word : parts)
        {
            if(!word.isEmpty())
            {
                words.add(word);
            }
        }

        Collections.reverse(words);
        System.out.println(words);
        System.out.println(String.join(".", words));



    }

}
