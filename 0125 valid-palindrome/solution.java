class Solution {
    public boolean isPalindrome(String s) {
       String sr=s.toLowerCase();
       char arr[]=sr.toCharArray();
       int l=0,r=s.length()-1;
       while(l<r){
        while(l<r && !isChar(arr[l])) l++;
        while(l<r && !isChar(arr[r])) r--;
        if(arr[l]!=arr[r]) return false;
        l++;
        r--;
       }
       return true;
    }
    private boolean isChar(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) return true;
        return false;
    }
}
