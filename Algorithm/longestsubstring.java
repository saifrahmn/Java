import java.util.*;

//leetcode ques no3
public class longestsubstring {
    
        public static int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, ans = 0;
            Set<Character> chars = new HashSet<>();
            for (char c : s.toCharArray()) {
                while (chars.contains(c)) {
                    chars.remove(s.charAt(i++));
                }
                chars.add(c);
                ans = Math.max(ans, j - i + 1);
                ++j;
            }
            return ans;
        }
    
    public static void main(String args[]){
        String s="abbatrwat";
        
        System.out.println(lengthOfLongestSubstring(s));
    }
}
