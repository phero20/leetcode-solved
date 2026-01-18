class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int arr[] = new int[26];
       char[] cr=magazine.toCharArray();
       char[] rr = ransomNote.toCharArray();
       for(char c:cr) arr[c-'a']++;
       for(char c:rr) {
         arr[c-'a']--;
         if(arr[c-'a']<0) return false;
       }
       return true;
    }
}
