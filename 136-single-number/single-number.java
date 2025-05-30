import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i=0;i<nums.length;i++) {
            result ^= nums[i]; // XOR cancels out duplicates
        }

        return result;
    }
}
