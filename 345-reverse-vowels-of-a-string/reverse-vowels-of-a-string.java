class Solution {
    private boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char arr[]=s.toCharArray();
        while(i<j){
            if(!isvowel(arr[i])){
                i++;
            }
            else if(!isvowel(arr[j])){
                j--;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    
}