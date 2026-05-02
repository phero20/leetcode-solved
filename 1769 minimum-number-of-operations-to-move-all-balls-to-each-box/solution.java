class Solution {
    public int[] minOperations(String boxes) {
        int co=0,o=0,idx=0;
        int[] res = new int[boxes.length()];
        for(char c:boxes.toCharArray()) {
            o+=co;
            if(c=='1') co++;
            res[idx++]=o;
        }
        o=0;
        co=0;
        for(int i = boxes.length()-1;i>=0;i--) {
            char c = boxes.charAt(i);
            o+=co;
            res[i]+=o;
            if(c=='1') co++;
        }
        return res;
    }
}
