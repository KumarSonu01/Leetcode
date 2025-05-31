class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int maxcount=0;
        int majority=nums[0];
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count>maxcount){
                maxcount=count;
                majority=nums[i];
            }
        }
        return majority;
    }
}