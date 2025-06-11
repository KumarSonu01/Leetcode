class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int original=x;
        while(x>0){
            reversed=reversed*10+(x%10);
            x/=10;
        }
        if(reversed==original){
                return true;
        }
        return false;
    }
}