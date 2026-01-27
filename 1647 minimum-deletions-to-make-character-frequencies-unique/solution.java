class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
        for(char c:s.toCharArray()) arr[c-'a']++;
         int total=0;
         Set<Integer> set=new HashSet<>();
         for(int i=0;i<26;i++){
             while(arr[i]>0 && !set.add(arr[i])){
                 arr[i]--;
                  total++;
             }
         }
           
         return total;
    }
}
