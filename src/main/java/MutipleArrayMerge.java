import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MutipleArrayMerge {

    public static void main(String[] args)
    {
        int[][] arr = {{5,6,6,2,7,1,8,9},
                        {5,6,1,8},
                         {8,4,42}};

        // Use a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Flatten the 2D array and add elements to the set
        for (int[] subArray : arr) {
            for (int num : subArray) {
                uniqueElements.add(num);
            }
        }

        // Print the HashSet directly
        System.out.println("Merged Set without Duplicates: " + uniqueElements);


    }
}
