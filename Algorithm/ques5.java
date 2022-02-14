import java.util.*;
public class ques4{
    public static String longestPalindrome(String s){
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
    public static void main(String[] args){
        String s="babad";
        System.err.println(longestPalindrome(s));

    }
}