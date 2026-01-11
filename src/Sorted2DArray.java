import java.util.Arrays;
import java.util.Comparator;
public class Sorted2DArray {
    public static void sortByColumn(int[][] matrix, int column) {
        // Use Arrays.sort() with a custom comparator to sort the matrix by the specified column    
        Arrays.sort(matrix,Comparator.comparingInt(row -> row[column]));
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {13, 12, 11},
                {6, 5, 4},
                {19, 18, 17}
        };
        int columnToSortBy=1;
        System.out.println("Origial Matrix:");
        printMatrix(matrix);
        sortByColumn(matrix,columnToSortBy);
        System.out.println("Sorted Matrix by Column " + columnToSortBy + ":");
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for (int i=0;i<rows;i++)   {
            for (int j=0;j<cols;j++)   {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}    