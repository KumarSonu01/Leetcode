class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    int n = nums.length;

    // Find first occurrence
    int left = 0, right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            ans[0] = mid;
            right = mid - 1; // keep searching left
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // Find last occurrence
    left = 0;
    right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            ans[1] = mid;
            left = mid + 1; // keep searching right
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return ans;
    }
}