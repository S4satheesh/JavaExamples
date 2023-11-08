public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaa";
        System.out.println(isPalindrome(s));
        System.out.println(s);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0)
        {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

