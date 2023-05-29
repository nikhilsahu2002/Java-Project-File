public class matrix {
    public static void main(String[] args) {
        int sum=0;
        int[][] matrix = {
            {2, 9, 4},
            {7, 5, 3},
            {6, 1, 8}
        };
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                     sum += matrix[i][j];
                    //  System.out.println(sum);
                }
            }
        }
        System.out.println(sum);
        sum=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==0) {
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
