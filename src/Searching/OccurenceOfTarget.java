package Searching;

public class OccurenceOfTarget {
    public static int FOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
public static int Loccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int a=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                a=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        return a;
}
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        int first=FOccurence(arr,target);
        int last=Loccurence(arr,target);
        if(first==-1){
            System.out.println("ele not found");
        }else {
            System.out.println(last-first+1);
        }



    }
}
