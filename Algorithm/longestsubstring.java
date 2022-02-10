//leetcode ques no3
public class longestsubstring {
    public static int lengthOfLongestSubstring(String s) {
        String st=new String(s);
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(st.charAt(j)==st.charAt(i+1)){
                    break;
                }
            }
            
           
            count++;
        }
        return -1;




















    }
    public static void main(String args[]){
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
