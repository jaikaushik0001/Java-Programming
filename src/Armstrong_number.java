import java.util.Scanner;

public class Armstrong_number {
    static void armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int result=0;
        int i = num;
        while (i > 0){
            int a = i%10;
            result = result + (int)Math.pow(a, (String.valueOf(num).length()));
            i = i/10;
        }
        if (result == num){
            System.out.println(num+" is an Armstrong Number");
        }
        else{
            System.out.println(num+" isn't an Armstrong Number");
        }
    }
}
