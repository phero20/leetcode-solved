class Solution {
    public int maxScore(String s) {
        int ones=0,zeros=0,max=0;
        for(char c:s.toCharArray()) if(c=='1') ones++;

        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)=='0') zeros++;
            else ones--;
            max=Math.max(max,ones+zeros);
        }
        return max;
    }
}
