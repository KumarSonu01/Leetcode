class Solution {
    public int mirrorDistance(int n) {
        int reversed=0;
        int original=n;
        while (n!=0){
            int rem=n%10;
            reversed=reversed*10+rem;
            n/=10;
        }
        int result=Math.abs(reversed-original);
        return result;
    }
}