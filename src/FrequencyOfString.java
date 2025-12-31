import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {
    static void FrequencyOf_String(){
        String s[] = {"jai","abc","jai","jai","abc","kaushik","kaushik"};
        Map<String,Integer> m = new HashMap<>();
        for (int i=0;i<s.length;i++){
            if (m.containsKey(s[i])){
                m.put(s[i],m.get(s[i])+1);
            }
            else{
                m.put(s[i],1);
            }
        }
        for (Map.Entry<String,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
