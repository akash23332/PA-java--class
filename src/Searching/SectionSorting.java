package Searching;

import java.util.Arrays;

public class SectionSorting {
    public static void main(String[] args) {
        int[] arr={4,2,1,5,7};
        KsmallestselectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    public static void selectionSort(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            int min=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[min]){
//                    min=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[min];
//            arr[min]=temp;
//
//        }
//    }

    public static void KsmallestselectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
}
