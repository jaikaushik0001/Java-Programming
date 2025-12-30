import java.util.Arrays;

public class MergeArrays {
    static void mergeArrays(){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10,11,12,13,14};
        int merged[] = new int[arr1.length + arr2.length];
        for (int i=0;i<merged.length;i++){
            if (i<arr1.length){
                merged[i] = arr1[i];
            }
            else{
                merged[i] = arr2[i - arr1.length];
            }
        }
        System.out.println(Arrays.toString(merged));
    }
}
