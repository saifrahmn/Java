public class linearsearch {
    public static int solution(int[] arr, int tar){
        int len=arr.length-1;
        for(int i=0;i<=len;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int[] arr={10,14,19,26,27,31,33,35,42,44};
        int tar=33;
        System.out.println(solution(arr,tar));
    }
}
