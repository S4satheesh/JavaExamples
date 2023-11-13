public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "sas";
        System.out.println(isPalindrome(s));
        System.out.println(s);
        System.out.println(s.length());
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0)
        {
            System.out.println("Length of the word is 0 ");
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

