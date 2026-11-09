class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character, Integer> map = new HashMap<>();
        int ans=0;

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                i=map.get(s.charAt(i));
                map.clear();
            }
            else{
                map.put(s.charAt(i),i);
                ans=Math.max(ans,map.size());
            }
        }
        return ans;
    }
}