public class StringInBuildMethods {

    public static  void main (String[] Args)
    {
        String name = "Pandu";
        String name2 = "Pandu";

        //String Length
        int  NameLength = name.length();
        System.out.println("String Length.."+ NameLength);

        //Concat
        String charPosition = name.concat(name2);
        System.out.println("String Concat..." + charPosition );

        //CharAt
        char ch = name.charAt(3);
        System.out.println("Specific char at in a String.."+ ch);

        //compareTo
        System.out.println(name.compareTo("Panduu"));

        //Equals
        boolean result = name.equals(name2);
        System.out.println(result);
    }

}

