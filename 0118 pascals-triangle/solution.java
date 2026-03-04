class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++) {
            List<Integer> ians = new ArrayList<>();
            for(int j=0;j<=i;j++) {
            if(j==0 || j==i) ians.add(1);
            else {
                ians.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            }
            ans.add(ians);
        }
        return ans;
    }
}
