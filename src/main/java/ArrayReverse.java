public class ArrayReverse {

    public static void  main (String[] args)
    {
        int[] arra = {10,25,16,15};
        int left = 0;
        int right = arra.length - 1;

        while (left < right)
        {
            int temp = arra[left];
            arra[left] = arra[right];
            arra[right] = temp;
            left++;
            right--;
        }

    }
}
