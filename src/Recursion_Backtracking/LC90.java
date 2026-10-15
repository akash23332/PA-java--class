package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        backTrack(nums, ans, 0, result);
        return result;
    }

    void backTrack(int[] nums, List<Integer> ans, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[index]);
        backTrack(nums, ans, index + 1, result);
        ans.remove(ans.size() - 1);

        int idx = index + 1;
        while (idx < nums.length && nums[idx] == nums[idx - 1]) idx++;
        backTrack(nums, ans, idx, result);
    }

    public static void main(String[] args) {
        backtracking.LC90 solver = new backtracking.LC90();
        int[] nums = {1, 2, 2};
        System.out.println(solver.subsetsWithDup(nums));
    }
}