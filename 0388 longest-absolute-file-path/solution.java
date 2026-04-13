class Solution {
    public int lengthLongestPath(String input) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        int maxLen = 0;
        String[] s = input.split("\n");
        for(String line:s) {
            int depth = line.lastIndexOf("\t") + 1;
            String name = line.substring(depth);
            if(name.contains(".")) {
                int currLen = map.get(depth) + name.length();
                maxLen = Math.max(maxLen, currLen);
            } else {
                int currLen = map.get(depth) + name.length() + 1;
                map.put(depth + 1, currLen);
            }
        }
        return maxLen;
    }
}
