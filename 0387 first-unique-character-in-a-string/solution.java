class Solution {
    public int firstUniqChar(String s) {
      int arr[] = new int[26];
      char[] cr=s.toCharArray();
      for(char c:cr) arr[c-'a']++;
      for(int i=0;i<cr.length;i++) if(arr[cr[i]-'a']==1) return i;
      return -1;
    }
}
