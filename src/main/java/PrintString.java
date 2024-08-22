import java.util.Scanner;

public class PrintString {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String myString = scan.nextLine();
        scan.close();

        System.out.println(myString);
    }
}
