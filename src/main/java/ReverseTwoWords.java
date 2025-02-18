import java.util.Objects;

public class ReverseTwoWords {


    public void ReverseWords(String givenName){

        String str = givenName;
        String[] Words = str.split(" ");
        System.out.println(Words[1] + " " + Words[0]);
    }


    public static void main(String[] args) {

        ReverseTwoWords obj = new ReverseTwoWords();
        obj.ReverseWords("Hello World");
    }
}
