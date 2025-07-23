class Solution {
    public String largestOddNumber(String num) {
        char chararray[] = num.toCharArray();
        for(int i=chararray.length-1; i>=0 ; i--){
            if (chararray[i] % 2 != 0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}