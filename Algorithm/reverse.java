public class reverse {
    public static void main(String args[]){
        String str="saifrahman";
        System.out.println(solution(str));
    }
    public static char solution(String str){
        int i;
        char s;

        int len=str.length()-1;
        for( i=0;i<=len;i++){
            for(int j=len;j>0;j--){
                s= str.charAt(j);
                return s;
            }
        }
        char sr='a';
        return sr;
    }
}
