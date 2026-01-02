import java.util.Arrays;

public class Rotate2DArray {
    static void Rotate2DArray(){
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int row=0;row<a.length;row++){
            for (int col=row+1;col<a[0].length;col++){
                int temp = a[row][col];
                a[row][col] = a[col][row];
                a[col][row] = temp;
            }
        }
        System.out.println(Arrays.deepToString(a));
        int b = a[0].length - 1;
        for (int row=0;row<a.length;row++){
            for (int col=0;col<a[0].length/2;col++){
                int temp = a[row][col];
                a[row][col] = a[row][a[0].length - col - 1];
                a[row][a[0].length - col - 1] = temp;
            }
        }
        System.out.println("The Clockwise Rotated Array is: ");
        System.out.println(Arrays.deepToString(a));
    }
}
