
public class binarysearch{
    public static int search(int[] arr,int tar){
        int len= arr.length;
        for(int i=0;i<len;i++){
            int mid=(len/2);
            if(arr[mid]>tar){
                len = mid;
            } 
             else if(arr[mid]<tar){
                i = mid;
            }
            else{
                return mid;
            }
        } 
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,5,8,12,16,20,38,56,72,91},target=12;
        System.out.println("the output of the search is" + search(arr,target));
    }
}