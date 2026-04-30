class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>();
        for(int i=0;i<names.length;i++) {
            map.put(heights[i],names[i]);
        }
        String[] ans = new String[names.length];
        int k =0,r=names.length-1;
        for(String s:map.values()) ans[k++] = s;
        k=0;
        while(k<=r) {
            String temp = ans[k];
            ans[k++] = ans[r];
            ans[r--] = temp;
        }
        return ans;
    }
}
