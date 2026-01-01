import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {
    static void  rotateTheArray(){
        int a[] = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int j,last;
            last = a[a.length - 1];
            for (j=a.length-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0] = last;
        }
        System.out.println(Arrays.toString(a));
    }
}
