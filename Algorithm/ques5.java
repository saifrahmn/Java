import java.util.*;
public class ques5{
    public static int longestPalindrome(String s){
     int i=0, j=0, ans=0;
     Set<Character> chars= new HashSet<>();
     for(char c: s.toCharArray()){
         while(chars.contains(c)){
             chars.remove(s.charAt(i++));
         }
         chars.add(c);
         ans = Math.max(ans, j-i+1);
         ++j;
         System.out.println(chars);
     }
     
     return ans;
    }
    public static void main(String[] args){
        String s="abcddeqde";
        System.err.println(longestPalindrome(s));

    }
}