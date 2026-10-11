
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];

        int max = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            total += diff[i];
        }

        if (k >= total) {
            return 0;
        }

        // Binary search for the minimum possible maximum difference
        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long needed = 0;

            for (int i = 0; i < n; i++) {
                if (diff[i] > mid) {
                    needed += diff[i] - mid;
                }
            }

            if (needed <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Reduce every difference to at most low
        long used = 0;

        for (int i = 0; i < n; i++) {
            if (diff[i] > low) {
                used += diff[i] - low;
                diff[i] = low;
            }
        }

        // Use remaining operations to reduce some values by one
        long remaining = k - used;

        for (int i = 0; i < n && remaining > 0; i++) {
            if (diff[i] == low && low > 0) {
                diff[i]--;
                remaining--;
            }
        }

        // Calculate the final sum
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (long) diff[i] * diff[i];
        }

        return sum;
    }
}
