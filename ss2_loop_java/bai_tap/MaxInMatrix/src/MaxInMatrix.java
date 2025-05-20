public class MaxInMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.2, 3.4, 5.6},
                {10.8, 9.0, 2.3},
        };

        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Gia tri lon nhat:  " + max);
        System.out.println("Tai dong" + maxRow + ", cot " + maxCol);
    }
}

