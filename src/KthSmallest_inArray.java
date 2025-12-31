import java.util.*;

public class KthSmallest_inArray {
    static void KthSmallest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        int a[][] = {{1,2,3,1},{1,2,2,3},{1,1,2,3},{1,2,3,3}};
        Set<Integer> s = new TreeSet<>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                s.add(a[i][j]);
            }
        }
        Iterator i = s.iterator();
        int n=1;
        while (i.hasNext()){
            if (n==k){
                System.out.println(k+"th Smallest Element is: "+i.next());
                break;
            }
            i.next();
            n++;
        }
    }

    // Finding Kth element using priority queue
    static void  priorityQ(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();
        int a[][] = {{1,2,3,1},{1,2,2,3},{1,1,2,3},{1,2,3,3}};
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                p.add(a[i][j]);
            }
        }
        int result = Integer.MIN_VALUE;
        for (int i=0;i<k;i++){
            result = p.poll();
        }
        System.out.println("The "+k+"th Smallest Element is: "+result);
    }
}
