import java.util.Scanner;

public class Palindrome {
    static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        boolean flag = true;
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i) == s.charAt(s.length() - i - 1)){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String isn't a palindrome");
        }
    }
}
