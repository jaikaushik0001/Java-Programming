public class maximum_in_Matrix {
    static void maximum(){
        int a[][] = {{1,2,3},{4,31,6},{8,22,16}};
        int max = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println("Largest Element of the array is: "+max);
    }
}
