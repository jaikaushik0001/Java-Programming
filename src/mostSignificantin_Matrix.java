import java.util.HashMap;
import java.util.Map;

public class mostSignificantin_Matrix {
    static void mostSignificant(){
        int a[][] = {{1,2,3,1},{1,2,2,3},{1,1,2,3},{1,2,3,3}};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (map.containsKey(a[i][j])){
                    map.put(a[i][j],map.get(a[i][j])+1);
                }
                else{
                    map.put(a[i][j],1);
                }
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>maxValue){
                maxValue = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxElement+" : "+maxValue);
    }

    static void secondMostSignificant(){
        int a[][] = {{1,2,3,1},{1,2,2,3},{1,1,2,3},{1,2,3,3}};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++) {
                if (map.containsKey(a[i][j])) {
                    map.put(a[i][j], map.get(a[i][j]) + 1);
                } else {
                    map.put(a[i][j], 1);
                }
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxkey = Integer.MIN_VALUE;
        int secValue = Integer.MIN_VALUE;
        int seckey = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() > maxValue){
                secValue = maxValue;
                seckey = maxkey;
                maxValue = entry.getValue();
                maxkey = entry.getKey();
            }
            else if (secValue < entry.getValue() && entry.getValue() != maxValue){
                secValue = entry.getValue();
                seckey = entry.getKey();
            }
        }
        System.out.println(seckey+" : "+secValue);
    }
}
