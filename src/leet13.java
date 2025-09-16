import java.util.HashMap;

public class leet13 {
    public static void main(String[] args) {

        String s = "III";
        System.out.println(romanToInt(s));
    }
        public static int romanToInt(String s) {
            HashMap<Character,Integer> romanVal=new HashMap<>();
            romanVal.put('I', 1);
            romanVal.put('V', 5);
            romanVal.put('X', 10);
            romanVal.put('L', 50);
            romanVal.put('C', 100);
            romanVal.put('D', 500);
            romanVal.put('M', 1000);
            int result = 0;
            int prevValue = 0;
            for (int i = s.length()-1; i >=0 ; i--) {
                int value=romanVal.get(s.charAt(i));
                if (value<prevValue){
                    result-=value;
                }else result+=value;
                prevValue=value;
            }
            return result;

        }

}

