package org.example.searchInsertPosition;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 3, 5, 6};
        int target = 1;
        int result = solution.searchInsert(nums, target);
        System.out.println(result);
    }
}
