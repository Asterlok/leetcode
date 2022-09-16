public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        Solution s = new Solution();
        s.twoSum(nums, target);
        int[] answer = s.twoSum(nums, target);
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] nums2 = {1, 2, 3, 10};
        int target2 = 13;
        Solution s2 = new Solution();
        s2.twoSum(nums2, target2);
        int[] answer2 = s2.twoSum(nums2, target2);
        for (int b : answer2) {
            System.out.print(b + " ");
        }
    }
}