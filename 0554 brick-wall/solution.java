class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> fr = new HashMap<>();
        int ma=0;
        for(List<Integer> li:wall) {
            int pr = 0;
            for(int i=0;i<li.size()-1;i++) {
                pr+=li.get(i);
                fr.put(pr,fr.getOrDefault(pr,0)+1);
                ma = Math.max(ma,fr.get(pr));
            }
        }
        return wall.size()-ma;
    }
}
