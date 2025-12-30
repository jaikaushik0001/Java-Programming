public class secondLargestInArray {
    static void secondLargest(){
        int arr[] = {1};
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for (int i : arr){
            if (largest < i){
                seclargest = largest;
                largest = i;
            }
            else if (i > seclargest && i!=largest){
                seclargest = i;
            }
        }
        System.out.println("The Second largest element is: "+ seclargest);
    }
}
