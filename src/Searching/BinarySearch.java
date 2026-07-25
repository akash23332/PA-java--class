package Searching;

public class BinarySearch {
    public static int bs(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,31};
        int target=4;
        int ans=bs(arr,target);
        if(ans==-1){
            System.out.println("Nf");
        }
        else {
            System.out.println(ans);
        }


    }
}
