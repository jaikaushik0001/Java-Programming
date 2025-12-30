import java.util.HashMap;
import java.util.Map;

public class MostSignificantInArray {
    static void mostSignificant(){
        int a[] = {1,2,2,3,4,5,5,5,5,6,6,6,7,7};
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (m.containsKey(a[i])){
                m.put(a[i],m.get(a[i])+1);
            }
            else{
                m.put(a[i],1);
            }
        }
        int maxValue = 0;
        int maxElement = 0;
        for (Map.Entry<Integer,Integer> entry: m.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxElement+" : "+maxValue);
    }
}
