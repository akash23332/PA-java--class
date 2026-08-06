package Sorting;

public class mergeSort {
    public static void brea(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        int mid=lo+(hi-lo)/2;
        brea(arr,lo,mid);
        brea(arr,mid+1,hi);
        merge(arr,lo,mid,hi);

    }
    public static void merge(int[] arr,int lo,int mid,int hi){
        int[] temp=new int[hi-lo+1];
        int left=lo;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=hi){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                k++;
                left++;

            }
            else {
                temp[k]=arr[right];
                k++;
                right++;
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while (right<=hi){
            temp[k++]=arr[right++];

        }
        for (int i=lo;i<=hi;i++){
            arr[i]=temp[i-lo];
        }
    }
    public static void main(String[] args) {
        int[] arr={10,4,6,1,11,3,2,8};
        int lo=0;
        int hi=arr.length;
        brea(arr, lo, hi - 1);

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
