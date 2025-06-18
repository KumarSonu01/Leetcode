class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

    for (int i = 1; i < nums.length; i++) {
        int tempMax = currentMax;
        int tempMin = currentMin;
    currentMax = Math.max(nums[i], Math.max(tempMax * nums[i], tempMin * nums[i]));
    currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], tempMin * nums[i])); 
    maxProduct = Math.max(maxProduct, currentMax);
}
        return maxProduct;
    }
}