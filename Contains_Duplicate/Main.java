import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {6, 4, 6, 1, 2, 3};
        boolean rez = Solution.containsDuplicate(nums);
        System.out.println(rez);
    }
}

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        //make set with distinct elements
        Set<Integer> set = new HashSet<Integer>();
        //for each element in nums:
        for(int i : nums)
            // if it adds equals elements return true
            if(!set.add(i)) {
                return true; }
        return false;
    }
}