class Solution {
    public int maxNumberOfBalloons(String text) {
       int[] arr = new int[26];
       char[] cr=text.toCharArray();
       for(char c:cr) arr[c-'a']++;
        arr['l'-'a']/=2;
        arr['o'-'a']/=2;
        int min = cr.length;
        char[] b={'a','b','n','l','o'};
        for(char c:b) min=Math.min(min,arr[c-'a']);
       return min;
    }
  
}
