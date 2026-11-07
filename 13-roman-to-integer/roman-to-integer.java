class Solution {
    public int romanToInt(String s) {
        Map <Character, Integer> replace = new HashMap<>();
        replace.put('I', 1);
        replace.put('V', 5);
        replace.put('X', 10);
        replace.put('L', 50);
        replace.put('C', 100);
        replace.put('D', 500);
        replace.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() &&
                replace.get(s.charAt(i)) < replace.get(s.charAt(i + 1))) {

                result -= replace.get(s.charAt(i));

            } else {
                result += replace.get(s.charAt(i));
            }
        }

        return result;

    }
}