import java.util.Arrays;

public class ReaarangeEvenNumbersToLeft {
    static void Rearrange(){
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int left = 0;
        int right = a.length - 1;
        while (left<=right){
            if (a[left]%2 == 0){
                left++;
            }
            else if (a[right]%2 != 0){
                right--;
            }
            else{
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("The Rearranged Array is: "+ Arrays.toString(a));
    }
}
