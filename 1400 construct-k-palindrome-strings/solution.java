class Solution {
    public boolean canConstruct(String s, int k) {
        int[] arr = new int[26];
        if(s.length()<k) return false;
        for(char c:s.toCharArray()) arr[c-'a']++;

        int ct=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 2!=0) ct++;
        }

        return ct<=k;
    }
}
