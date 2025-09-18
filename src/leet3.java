import java.util.HashSet;

public class leet3 {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring1(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int first=0;
        int last=0;
        int count=0;
        int length=0;
        while (last<s.length()){
            if (!set.contains(s.charAt(last))){
                set.add(s.charAt(last));
                count++;
                last++;
                length=Math.max(length,count);
            }else {
                length=Math.max(length,count);
                set.remove(s.charAt(first));
                first++;
                count=last-first;
            }
        }
        return length;
    }



    //gpt
    public static int lengthOfLongestSubstring1(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;

    }
}

