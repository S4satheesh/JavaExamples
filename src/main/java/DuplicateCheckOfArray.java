import java.util.Map;
import java.util.HashMap;

public class DuplicateCheckOfArray {

    public void DuplicateCheck() {
    int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
    int n = arr.length;

        System.out.println("Duplicate values:...");
        for (int i=0; i< n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate value.. " + arr[i]);
                break;
            }
        }
}


    public static void main(String[] args) {
        DuplicateCheckOfArray obj = new DuplicateCheckOfArray();
        obj.DuplicateCheck();

    }
}
