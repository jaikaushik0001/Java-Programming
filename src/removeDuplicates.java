import java.util.*;

public class removeDuplicates {

    // This is bruteforce approach
    static void RemoveDuplicates(){
        int a[] = {1,1,2,2,4,6,4,2,1,2,4,2,6,4};
        Set<Integer> s = new TreeSet<>();
        for (int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        Iterator i = s.iterator();
        int count = 0;
        while (i.hasNext()){
            a[count] = (int)i.next();
            count++;
        }
        for (int j=count;j<a.length;j++){
            a[j] = 0;
        }
        System.out.println(Arrays.toString(a));
    }

    // This is the optimized approach to solve the problem
    static void opimizedRemoveDuplicates(){
        int a[] = {1,1,2,2,2,3,3,3,4,4,4,4,4,4,5,5,5,5,5};
        int index = 0;
        for (int i=1;i<a.length;i++){
            if (a[index] != a[i]){
                index++;
                a[index] = a[i];
            }
        }
        for (int i=index+1;i<a.length;i++){
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
