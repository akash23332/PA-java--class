package Recursion;

import java.util.ArrayList;

public class ques1 {
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> current=new ArrayList<>();
        int[] nums={1,2,3};
        solve(nums,0,current);
        System.out.println(ans+" ");


    }
    static void solve(int[] nums,int index, ArrayList<Integer>current){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(nums,index+1,current);
        current.remove(current.size()-1);
        solve(nums,index+1,current);

    }
}
