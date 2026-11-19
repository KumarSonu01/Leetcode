class Solution {
    public int minimizeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int low = nums[n - 1] - nums[2];
        int mid = nums[n - 2] - nums[1];
        int high = nums[n - 3] - nums[0];

        return Math.min(low, Math.min(mid, high));
    }
}