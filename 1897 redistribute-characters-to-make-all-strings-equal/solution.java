class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1) return true;
        int count=0;
        for(String s:words) count+=s.length();
        if(count%words.length!=0) return false;
         int[] freq = new int[26];
        for(String s:words) {
            for(char c:s.toCharArray()) freq[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]%words.length!=0) return false;
        }
        return true;
    }
}
