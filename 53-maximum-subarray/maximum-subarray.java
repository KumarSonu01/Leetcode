class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int max=Integer.MIN_VALUE,sum=0;

        for(int i=0;i<n;i++){
           sum+=nums[i];          
           if(sum<nums[i]){
            sum=nums[i];
           }
           max=Math.max(max,sum);
        }

        return max;
    }
}