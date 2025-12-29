import java.util.Scanner;

public class Prime {
    static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        // Checking if its 1 or 2 or any even number
        if (num == 1 || num ==2) isPrime = false;
        if (num%2 == 0) isPrime = false;
        //Proceeding further if its an odd number
        for (int i=3;i*i<=num;i+=2){
            if (num % i ==0){
                isPrime = false;
            }
        }
        if (isPrime == true){
            System.out.println("This is Prime Number");
        }
        else{
            System.out.println("This isn't a Prime Number");
        }
    }
}
