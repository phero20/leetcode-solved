class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int n:arr) 
        if(map.containsKey(n)) map.put(n, map.get(n) + 1);
        else map.put(n,1);
        for(int v:map.values())
            if(s.add(v)==false) return false;
        return true;
    }
}
