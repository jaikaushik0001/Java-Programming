import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    static void largest(){
        int b[] = {1,2,3,2,2,5,7,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of K: ");
        int k = sc.nextInt();
        PriorityQueue <Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: b){
            p.add(i);
        }
        int result = 0;
        for (int i=0;i<k;i++){
            result = p.poll();
        }
        System.out.println("The Kth Largest Element in the Array is: "+result);
    }
}
