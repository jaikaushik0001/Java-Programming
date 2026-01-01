public class UniqueElement {
    static void unique(){
        int a[] = {1,1,2,2,3,3,4,5,5,5,6,6};
        int result = 0;
        for (int n : a){
            result = result ^ n;
        }
        System.out.println("Unique Element in the Array is: "+result);
    }
}
