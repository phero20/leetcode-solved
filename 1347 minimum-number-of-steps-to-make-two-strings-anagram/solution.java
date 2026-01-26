class Solution {
    public int minSteps(String s, String t) {
       int[] arr=new int[26];
        int count=0;
        for(char c:s.toCharArray()) arr[c-'a']++;
        for(char c:t.toCharArray()) arr[c-'a']--;
        for(int i:arr) if(i>0) count+=i;
        return count;
    }
}
