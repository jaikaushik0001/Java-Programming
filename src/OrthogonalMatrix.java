public class OrthogonalMatrix
{
    public static boolean areMatricesOrthogonal(int[][] matrix1,int[][] matrix2)
    {
        int rows1=matrix1.length;
        int cols1=matrix1[0].length;
        int rows2=matrix2.length;
        int cols2=matrix2[0].length;
        // Check if matrices have compatible dimensions
        if (rows1 != rows2 || cols1 != cols2) {
            return false;
        }
        // Check the dot product for each row/column pair
        for (int i=0;i<rows1;i++) {
            int dotProduct = 0;
            for (int j=0;j<cols1;j++) {
                dotProduct += matrix1[i][j] * matrix2[i][j];
            }
            if (dotProduct!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{0,1},{-1,0}};

        boolean areOrthogonal = areMatricesOrthogonal(matrix1, matrix2);
        if (areOrthogonal) {
            System.out.println("The matrices are orthogonal.");
        } else {
            System.out.println("The matrices are not orthogonal.");
        }
    }
}