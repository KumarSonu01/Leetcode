class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy temp back into nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
