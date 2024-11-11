
import java.util.ArrayList;
import java.util.List;

public class missingValueAndRepeats {

    public static int[] findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int maxNum = n * n;  // Maximum number that should be in the grid

        // Flatten the grid into a single list
        List<Integer> flatList = new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                flatList.add(num);
            }
        }

        // Create a count array to keep track of occurrences of each number
        int[] count = new int[maxNum + 1];

        // Count occurrences of each number in the flat list
        for (int num : flatList) {
            count[num]++;
        }

        // Initialize variables for repeated (a) and missing (b) numbers
        int a = -1, b = -1;

        // Determine the repeated and missing numbers
        for (int i = 1; i <= maxNum; i++) {
            if (count[i] == 2) {
                a = i;  // Found the repeated number
            } else if (count[i] == 0) {
                b = i;  // Found the missing number
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {{1, 3}, {2, 2}};
        int[] result1 = findMissingAndRepeated(grid1);
        System.out.println("Example 1 Output: [" + result1[0] + ", " + result1[1] + "]");  // Expected output: [2, 4]

        // Example 2
        int[][] grid2 = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        int[] result2 = findMissingAndRepeated(grid2);
        System.out.println("Example 2 Output: [" + result2[0] + ", " + result2[1] + "]");  // Expected output: [9, 5]
    }
}
