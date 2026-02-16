class Solution {
    public int countGoodSubstrings(String s) {
        int sum=0;
        for(int i=0;i<s.length()-2;i++) {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if(a!=b && a!=c && b!=c) sum++;
        }
        return sum;
    }
}
