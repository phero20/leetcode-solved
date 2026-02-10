class Solution {
    public int partitionString(String s) {
        int mask=0;
        int count=1;

        for(char c:s.toCharArray()) {
            int bit = 1 << (c-'a');

            if((mask & bit)!=0) {
                count++;
                mask=0;
            }
            mask |= bit;
        }
        return count;
    }
}
