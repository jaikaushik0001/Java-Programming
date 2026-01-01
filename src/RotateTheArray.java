import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {

    // BruteForce Approach to solve the problem
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

    // Optimized approach to Rotate the Array
    static void reverse(int a[],int start, int end){
        while (start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void rotation(){
        int a[] = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        reverse (a,0,a.length-1);
        reverse (a,0,n-1);
        reverse (a,n,a.length-1);
        System.out.println("The Rotated Array is: "+Arrays.toString(a));
    }
}
