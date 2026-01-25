class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<Integer,List<String>> map = new HashMap<>();
    for(String s:strs){
        int key=getKey(s);
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(s);
    }
    return new ArrayList<>(map.values());
    }

    private int getKey(String s){
        int[] arr=new int[26];
        for(char c:s.toCharArray()) arr[c-'a']++;
        return Arrays.hashCode(arr);
    }
}
