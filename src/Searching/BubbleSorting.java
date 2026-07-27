package Searching;

import java.util.Arrays;

public class BubbleSorting {
    public static void asebubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void decbubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,42,341};
//        asebubble(arr);
        decbubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
