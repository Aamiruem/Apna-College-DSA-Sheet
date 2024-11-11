import java.util.Arrays;

public class MissingValue {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];
        Arrays.fill(freq, 0);

        for (int[] row : grid)
            for (int col : row)
                freq[col]++;

        int[] ans = new int[2];
        for (int i = 1; i <= n * n; i++)
            if (freq[i] == 2)
                ans[0] = i;
            else if (freq[i] == 0)
                ans[1] = i;

        return ans;

    }
    public static void main(String[] args) {
        MissingValue mv = new MissingValue();
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] result = mv.findMissingAndRepeatedValues(grid);
        System.out.println("Missing value: " + result[0]);
        System.out.println("Repeated value: " + result[1]);
    }
}
