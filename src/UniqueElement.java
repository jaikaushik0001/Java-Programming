public class UniqueElement {

    //This would work fine if the duplicates appear in the multiple of 2s
    static void unique(){
        int a[] = {1,1,2,2,3,3,4,5,5,5,6,6};
        int result = 0;
        for (int n : a){
            result = result ^ n;
        }
        System.out.println("Unique Element in the Array is: "+result);
    }

    //Otherwise using the hashmap is the correct approach
}

