public class CountVowels {
    static void countVowels(){
        String s = "jaikaushik";
        int count = 0;
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Number of vowels are: "+count);
    }
}
