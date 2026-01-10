class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[] = new int[26];
        for(char c:s.toCharArray()) arr[c-'a']++;
        int sr=0;
       for(int f:arr){
        if(f==0) continue;
        if(sr==0) sr=f;
        else if(sr!=f) return false;
       }
       
        return true;
    }
}
