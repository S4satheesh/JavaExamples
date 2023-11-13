import java.util.Arrays;

public class MyClass {

    public void addTwoNumbers(int x, int y) {
        System.out.println(x + y);
        return;
    }

    // want to write code for sorting an array
    public void sortArray(int[] array) {
        // sorting array
        Arrays.sort(array);
        //want to print array
        System.out.println(Arrays.toString(array));
        return;

    }

    public static void main(String[] args) {
        // Your Java code here
        System.out.println("Hello wold");
        MyClass myClass = new MyClass();
        myClass.addTwoNumbers(10, 20);
        myClass.sortArray(new int[]{110, 2, 3});

    }
}