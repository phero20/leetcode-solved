class Solution {
    public int findPairs(int[] nums, int k) {
      Set<Integer> s = new HashSet<>();
      Set<Integer> s1 = new HashSet<>();

      for(int i:nums){
        if(s.contains(i-k)) s1.add(i-k);
        if(s.contains(i+k)) s1.add(i);
        s.add(i);
      }
      return s1.size();
    }
}

