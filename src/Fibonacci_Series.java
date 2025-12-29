import java.util.Scanner;

public class Fibonacci_Series {
    static void fibonacci_series(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int l = sc.nextInt();

        int a = 0;
        int b = 1;
        if (l>=1) System.out.print(a+" ");
        if (l>=2) System.out.print(b+" ");
        int temp = 0;
        for (int i=1;i<=l;i++){
            temp = a+b;
            a = b;
            b = temp;
            System.out.print(b+" ");
        }
    }
}
