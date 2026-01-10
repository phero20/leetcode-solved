class Solution {
    public int longestPalindrome(String s) {
        int[] map=new int[128];
        for(char c:s.toCharArray()) map[c]++;
        int sum=0;
        boolean b=false;
        for(int c:map){
            if(c%2==0) sum+=c;
            else {sum+=c-1; b=true;}
        }
        return sum+(b?1:0);

    }
}
