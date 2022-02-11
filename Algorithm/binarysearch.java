
public class binarysearch{
    public static int search(int[] arr,int tar){
        int len= arr.length;
        int mid= ((len-1)/2);
        for(int i=0;i<=len;i++){
            
            if(arr[mid]>tar){
                len = mid;
            } 
             else if(arr[mid]<tar){
                i = mid;
            }
            else{
                return mid+1;
                
            }
            mid = ((i+len)/2);
        } 
        return -1;
       
    }
    public static void main(String args[]){
        int arr[]={2,5,8,12,16,20,38,56,72,91},target=38;
        System.out.println("the output of the search is" + search(arr,target));
    }
}

//These program is not valid it exceeds the given time, it has something to do with Asymptotic Notation