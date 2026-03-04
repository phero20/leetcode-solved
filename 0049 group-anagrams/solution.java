class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<Integer,List<String>> map = new HashMap<>();
    for(String s:strs) {
        int key = getKey(s);
        if(!map.containsKey(key)) {
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(s); 
    }
    return new ArrayList<>(map.values());
    }
    private int getKey(String s) {
        int[] d=new int[26];
        for(char c:s.toCharArray()) d[c-'a']++;
        return Arrays.hashCode(d);
    }
}
