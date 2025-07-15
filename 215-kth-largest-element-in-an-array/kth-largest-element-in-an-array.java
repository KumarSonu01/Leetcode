class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        boolean flag=true;
        Arrays.sort(nums);
        if(k > nums.length || k <= 0) {
            flag=false;
        } else {
            ans=nums[nums.length - k];
        }
        return ans;
    }
}