import java.util.Arrays;

public class MoveZerosToEnd {
    static void moveZeros(){
        int a[] = {0,1,1,2,3,0,0,0,11,33,0,2,0,3};
        int index = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i] != 0){
                a[index] = a[i];
                index++;
            }
        }
        if (index<a.length-1){
            for (int i=index;i<a.length;i++){
                a[i] = 0;
            }
        }
        System.out.println("Result array is: "+ Arrays.toString(a));
    }
}
