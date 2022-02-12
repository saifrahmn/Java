//leetcode ques no3
public class longestsubstring {
    public static int lengthOfLongestSubstring(String s) {
        String st=new String(s);
        String[] uni = {};
        int[] size=new int[100];
        int lar=0,p=0;
        int len = (st.length()-1);
        for(int i=0;i<=len;i++){
            int count = 0;
            for(int j=uni[p].length();j<i;j++){
                if(st.charAt(j)==st.charAt(i)){
                    uni[p]=
                    size[i]=count;
                    break;
                }
                count++;
            }
        }
        for(int i=0;i<size.length;i++){
            
            if(lar<=size[i]){
                lar=size[i];
            }
        }
        return lar+1;
    }
    public static void main(String args[]){
        String s="abbatrwat";
        
        System.out.println(lengthOfLongestSubstring(s));
    }
}
