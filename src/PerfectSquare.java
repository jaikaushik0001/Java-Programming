import java.util.Scanner;

public class PerfectSquare {
    static void square(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sq = sc.nextInt();
        if (sq<0) System.out.println("Negative number, negative numbers don't aren't the perfect squares");
        else{
            for (int i=0;i*i<=sq;i++){
                if (i*i == sq){
                    System.out.println(sq+" is a perfect square of "+i);
                    break;
                }
            }
        }
    }
}
