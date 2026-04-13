class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s:words) {
            if (s.length() < k) continue;
            String prefix = s.substring(0,k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        int ans = 0;
        for(int i:map.values()) {
            if(i>1) ans++;
        }
        return ans;
    }
}
