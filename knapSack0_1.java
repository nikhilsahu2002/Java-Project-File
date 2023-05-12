public class knapSack0_1 {
    public static void main(String[] args) {
        int[] values = { 10,12,28 };
        int[] weights = { 1, 2, 4 };
        int capacity = 6;
        int n = values.length;

        int[][] maxValues = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    maxValues[i][j] = maxValues[i - 1][j];
                } else {
                    maxValues[i][j] = Math.max(maxValues[i - 1][j], values[i - 1] + maxValues[i - 1][j - weights[i - 1]]);
                }
            }
        }

        System.out.println("Maximum value: " + maxValues[n][capacity]);
    }
}

