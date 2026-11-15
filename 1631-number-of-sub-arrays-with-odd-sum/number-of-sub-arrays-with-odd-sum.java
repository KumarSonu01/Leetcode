class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int odd=0;
        int even=1;
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum=(sum+arr[i])%2;
            if(sum==1){
                ans=(ans+even)%MOD;
                odd++;
            }
            else{
                ans=(ans+odd)%MOD;
                even++;
            }
        }
        return ans; 
    }
}