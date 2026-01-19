class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
      Set<Integer> s=new HashSet<>();
      for(int i:map.values()){
        if(!s.add(i)) return false;
      }
      return true;
    }
}
