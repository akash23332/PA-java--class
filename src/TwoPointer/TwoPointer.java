package TwoPointer;
import java.util.*;
public class TwoPointer {
    public static int lengthOf(String s){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int Max=0;
        for(int right=0;right<s.length();right++){
            char curr=s.charAt(right);
            if(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            Max=Math.max(Max,right-left+1);
        }
        return Max;




    }
    public static void main(String[] args) {
        String s="abcabcab";
        System.out.println(lengthOf(s));


    }
}
