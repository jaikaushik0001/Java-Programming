import java.util.Scanner;

// Java Program to divide a string in 'N' equal parts.

public class StringDivisionInEqualParts {
    static void stringDivision(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.next();
        System.out.print("Enter the number of parts: ");
        int n = sc.nextInt();
        int num = s.length()/n;
        for (int i=0;i<s.length();i=i+num){
            System.out.println(s.substring(i,i+num));
        }
    }
}
