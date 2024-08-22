public class Challenge1 {

    public static void main(String[] args) {

        int a = 18;

        System.out.println(a);

        if (a % 2 == 1) {
            System.out.println("Weird -- Odd number");
        } else {
            if (a >= 2 && a <= 5) {
                System.out.println("Not Weird -- Even number in range 2 - 5");
            } else if (a >= 6 && a <= 20) {
                System.out.println("Weird -- Even number in range 6 - 20");
            } else {
                System.out.println("Not Weird -- Even number greater than 20");
            }
        }
    }
}
