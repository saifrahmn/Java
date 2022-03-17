public class zigzag {
    public static String solution(String s,int rows){
        String arr[];
        for(int i=0;i<=(s.length()-1);i++){
            for(int j=0;j<rows;j++){
                arr[j]=s.charAt(i);
                
            }
        }
        return -1;
    }
    public static void main(){
        String s="PAYPALISHIRING";
        int rows=3;
        System.out.println(solution(s,rows));
    }
}    
