/*
This code is linearsearch algorithm to find the given
target in a particular array.
*/
public class linerarsearch {
    public static int search(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int arr[]={2,43,65,3,86,12,14,65,45},target=12;
        System.out.println("The output of the following algorithm is "+search(arr,target));
    }
}
