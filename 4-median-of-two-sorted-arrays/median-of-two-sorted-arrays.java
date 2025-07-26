import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int m = nums2.length;
        int[] arr3 = new int[l + m];

        // Merge arrays
        for (int i = 0; i < l; i++) {
            arr3[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[l + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(arr3);

        int total = l + m;
        int mid = total / 2;

        // Find median
        if (total % 2 != 0) {
            return arr3[mid];
        } else {
            return (arr3[mid] + arr3[mid - 1]) / 2.0;
        }
    }
}
