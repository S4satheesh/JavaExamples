import java.util.HashSet;

public class FindDuplicates {


    public void duplicateUsingHashSet()
    {
        int[] arr = {4, 2, 7, 4, 8, 2, 9};
        HashSet<Integer> seen = new HashSet<>();

        System.out.print("Duplicates: ");
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public void duplicateUsingForLoop() {
        int[] my_array = {1, 2, 5, 5};

        // Iterate through the elements of the array.
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                // Check if two elements are equal and not the same element.
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element : " + my_array[j]);
                }
            }
        }
    }

        public static void main(String[] args) {
        FindDuplicates duplicates = new FindDuplicates();
        //duplicates.duplicateUsingHashSet();
        duplicates.duplicateUsingForLoop();
}
}
