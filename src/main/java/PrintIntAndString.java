import java.util.Scanner;

public class PrintIntAndString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine();
        String s = scan.nextLine();
        scan.close();


        System.out.println("myString is: " + s);
        System.out.println("My double is:" + d);
        System.out.println("my Int is: " + i);
    }
}
