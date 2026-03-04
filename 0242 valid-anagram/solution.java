class Solution {
    public boolean isAnagram(String s, String t) {
       int[] res = new int[126];
       for(char c:s.toCharArray()) res[c]++;
       for(char c:t.toCharArray()) res[c]--;
       for(int c:res) if(c!=0) return false; 
       return true;
    }
}
