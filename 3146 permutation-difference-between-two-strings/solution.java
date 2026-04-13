class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] map = new int[126];
        for(int i=0;i<s.length();i++) map[s.charAt(i)] = i;
        int sum = 0;
        for(int i=0;i<t.length();i++) {
            sum+= Math.abs(map[t.charAt(i)]-i);
        }
        return sum;
    }
}
