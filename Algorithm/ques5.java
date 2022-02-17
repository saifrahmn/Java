import java.util.*;
import java.lang.*;

public class ques5{
    public static String longestPalindrome(String s){
        String[] pal={};
        int p=0;
        int len = s.length()-1;
        for(int i=0;i<=len;i++){
            for(int j=0;j<=i;j++){
                if(pal[p].charAt(j)==s.charAt(i)){
                    pal[p]=st;
                    p++
                }
                st
            }
        }
    }
    public static void main(String[] args){
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}