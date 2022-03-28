public class reverse {
    public static void main(String args[]){
        String str="saifrahman";
        System.out.println(solution(str));
    }
    public static String solution(String str){
        int i;
        int len=str.length()-1;
        for( i=0;i<=len;i++){
            for(int j=len;j>0;j--){
                str.charAt(i)=str.charAt(j);
            }
        }
        return str;
    }
}
