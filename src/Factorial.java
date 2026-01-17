import java.util.Scanner;

public class Factorial {
    static void factorial(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int fact = 1;
        for (int i=num;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
