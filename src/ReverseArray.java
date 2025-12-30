import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=n-1;i>n/2;i--){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reversed Array is : "+ Arrays.toString(arr));
    }
}
