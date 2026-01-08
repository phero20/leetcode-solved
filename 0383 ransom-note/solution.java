class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] arr=new int[26];
       char[] m = magazine.toCharArray();
       char[] r=ransomNote.toCharArray();
       for(char c:m) arr[c-'a']++;
       for(char c:r){
        if(--arr[c-'a']<0) return false;
       }
       return true;
    }
}
