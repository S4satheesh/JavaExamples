public class ReverseWordContainsDots {

    public static void main(String[] args) {
        String Str = "..geeks..for.geeks.";
        String[] newWords = Str.split("\\.+"); // Fix: Splitting on one or more dots
        System.out.println(newWords[0]); // Output: geeks
    }
}
