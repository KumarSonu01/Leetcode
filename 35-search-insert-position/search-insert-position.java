class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=nums.length-1;
        boolean flag=false;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==nums[mid]){
                flag=true;
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}