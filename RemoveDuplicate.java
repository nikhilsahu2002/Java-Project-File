import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 7, 8, 4, 2};

        Arrays.sort(array);

        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            // Check if the current element is different from the previous
            if (i == 0 || array[i] != array[i - 1]) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Print the array with duplicates removed
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
