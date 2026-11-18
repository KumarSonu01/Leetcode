class Solution {
    public int minChanges(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i += 2) {
            HashMap<Character, Integer> map = new HashMap<>();

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(s.charAt(i + 1), map.getOrDefault(s.charAt(i + 1), 0) + 1);

            if (map.size() == 2) {
                ans++;
            }
        }

        return ans;
    }
}