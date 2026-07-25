package Searching;

public class MaxvalueFind {

    public static  int max(int[] arr,int Max){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        return Max;
    }
    public static void main(String[] args) {

        int[] arr={1,4,5,21,4,1};
        int Max=arr[0];
        System.out.println(max(arr,Max));

    }
}
