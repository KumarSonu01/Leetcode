class Solution {
    public void moveZeroes(int[] nums) {
        int temp[] = new int[nums.length];
        int index = 0;

        // Step 1: Add all non-zero elements to temp
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[index++] = nums[i];
            }
        }

        // Step 2: Fill the remaining elements with 0 (optional as array default is 0)
        // Not required in this case, as default int array in Java is already zeroed.

        // Step 3: Copy temp back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
