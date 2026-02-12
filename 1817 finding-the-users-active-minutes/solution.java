class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        int res[]=new int[k];
        for(int i[]:logs) map.computeIfAbsent(i[0], g -> new HashSet<>()).add(i[1]);
        for(Set<Integer> s:map.values()) res[s.size()-1]++;
        return res;
    }
}
