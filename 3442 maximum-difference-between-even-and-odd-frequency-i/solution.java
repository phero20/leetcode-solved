class Solution {
    public int maxDifference(String s) {
        int[] arr = new int[26];
        for(char c:s.toCharArray()) {
            arr[c-'a']++;
        }
        int maxO = -1,minE = 101;
        for(int i:arr) {
            if(i==0) continue;
            if((i & 1) == 0) {
                minE = Math.min(minE,i);
            } else if(i>maxO) {
                maxO = i;
            }
        }
        return maxO - minE;
    }
}
