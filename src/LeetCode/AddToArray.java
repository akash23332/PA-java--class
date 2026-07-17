package LeetCode;
import java.util.*;

public class AddToArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int k = 23;

        AddToArray obj = new AddToArray();

        System.out.println(obj.Add(arr, k));
    }

    public ArrayList<Integer> Add(int[] num, int k) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;

        while (i >= 0) {

            int rem = k % 10;

            int sum = num[i] + rem + carry;

            if (sum > 9) {
                ans.add(sum % 10);
                carry = sum / 10;
            }
            else {
                ans.add(sum);
                carry = 0;
            }

            k = k / 10;
            i--;
        }

        while (k > 0) {

            int sum = (k % 10) + carry;

            ans.add(sum % 10);

            carry = sum / 10;

            k = k / 10;
        }

        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);

        return ans;
    }
}