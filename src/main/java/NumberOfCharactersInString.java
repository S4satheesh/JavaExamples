import java.util.HashMap;

public class NumberOfCharactersInString {

    public void usingForLoop(){
        String name = "Hello World";
        int count = 0;
        for(int i= 0; i< name.length(); i++)
        {
            count++;
        }
        System.out.println(count);
    }

    public void usingHashMap(){

        String name = "HelloWorld";
        //Creating a HashMap object
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //Converting given string to char array
        char[] strArray = name.toCharArray();

        for(char c: strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
    public static void main(String[] args)
    {
       NumberOfCharactersInString obj = new NumberOfCharactersInString();
       //obj.usingForLoop();
       obj.usingHashMap();
    }
}
