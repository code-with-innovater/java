public class setmatrix {
        public static void setZeroes(int[][] matrix) {
                int m = matrix.length;
            int n = matrix[0].length;
            
            // Variables to mark whether the first row and first column need to be zeroed
            boolean firstRowHasZero = false;
            boolean firstColHasZero = false;
            
            // Check if the first row has any zeros
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    firstRowHasZero = true;
                    break;
                }
            }
            
            // Check if the first column has any zeros
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    firstColHasZero = true;
                    break;
                }
            }
            
            // Use the first row and first column to mark rows and columns that need to be zeroed
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;  // Mark row
                        matrix[0][j] = 0;  // Mark column
                    }
                }
            }
            
            // Set matrix cells to zero based on marks in the first row and first column
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            
            // Zero out the first row if needed
            if (firstRowHasZero) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }
            
            // Zero out the first column if needed
            if (firstColHasZero) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    
        public static void main(String[] args) {
            // Test case 1
            int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
            };
            
            setZeroes(matrix);
            // Output: [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
