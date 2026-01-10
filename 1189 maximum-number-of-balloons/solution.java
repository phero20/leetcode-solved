class Solution {
    public int maxNumberOfBalloons(String text) {
       int[] arr = new int[26];
       for(char c:text.toCharArray()) arr[c-'a']++;
       arr['l'-'a']/=2;
       arr['o'-'a']/=2;
       char idx[] = {'a', 'b', 'l', 'o', 'n'};
       int v=text.length();
       for(int c:idx) v=Math.min(v,arr[c-'a']);
         return v;
    }
  
}
