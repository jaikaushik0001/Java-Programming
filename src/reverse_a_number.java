import java.util.Scanner;

public class reverse_a_number {
    static void reverse_a_number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }


    static void reverseUsingWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}
