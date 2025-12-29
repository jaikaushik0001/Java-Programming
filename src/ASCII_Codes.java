//Write a Java program to toggle the case of each character in a given string without using built-in case conversion methods.

import java.util.Scanner;

public class ASCII_Codes {
    static void ASCII(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.next();
        String result = "";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c>='A' && c<='Z'){
                result = result + (char)(c + 32);
            }
            if (c>='a' && c<='z'){
                result = result + (char)(c - 32);
            }
        }
        System.out.println("The Result is: "+result);
    }
}
