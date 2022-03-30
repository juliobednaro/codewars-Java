package five.sol1;

public class Kata {
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] matrix = new int[a.length][a.length];
        int[][] invertedBMatrix = invertMatrix(b);

        // Fill out matrix
        for(int row=0; row<a.length; row++) {
            for(int col=0; col<a.length; col++) {
                matrix[row][col] = rowColumnMultiplication(a[row], invertedBMatrix[col]);
            }
        }

        return matrix;
    }

    public static int rowColumnMultiplication(int[] firstMatrixRow, int[] secondMatrixCol) {
        int product = 0;
        for (int i=0; i<firstMatrixRow.length; i++) {
            product += firstMatrixRow[i] * secondMatrixCol[i];
        }
        return product;
    }

    public static int[][] invertMatrix(int[][] matrix) {
        int[][] invertedMatrix = new int[matrix.length][matrix.length];

        for(int col=0; col<matrix.length; col++) {
            for(int row=0; row<matrix.length; row++) {
                invertedMatrix[col][row] = matrix[row][col];
            }
        }
        return invertedMatrix;
    }
}
/*
Not mine but cool:

int n = a.length;
int[][] res = new int[n][n];

for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
    for (int k = 0; k < n; k++) {
      res[i][j] += a[i][k] * b[k][j];
    }
  }
}
return res;
 */
