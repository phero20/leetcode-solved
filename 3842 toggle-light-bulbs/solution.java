class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for(int i:bulbs) {
           if (!sortedSet.add(i)) {
                sortedSet.remove(i);
            }
        }
        return new ArrayList(sortedSet);
    }
}
