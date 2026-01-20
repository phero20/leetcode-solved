class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];
        char[] cr=s.toCharArray();
        for(char c:cr) arr[c-'a']++;
        for(int i=1;i<cr.length;i++){
            if(arr[cr[i]-'a']!=arr[cr[i-1]-'a'])
            return false;
        }
        return true;
}
}
