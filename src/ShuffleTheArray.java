import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.Random;

// This implements the Fisher-Yates Algorithm which is the unbiased algorithm to shuffle the array elements.

public class ShuffleTheArray {
    static void shuffleArray(){
        int b[] = {1,2,3,4,5,6,7,8,9};
        Random r = new Random();
        for (int i=b.length - 1;i>=0;i--){
            int j = r.nextInt(i+1);
            int temp = b[j];
            b[j] = b[i];
            b[i] = temp;
        }
        System.out.println("The Shuffled Array is: "+ Arrays.toString(b));
    }
}
