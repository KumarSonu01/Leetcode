class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> map=new HashSet<>();
        boolean ans=false;

        for(int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                return ans=true;
            }
            else{
                map.add(nums[i]);
            }
        }

        return ans;
    }
}