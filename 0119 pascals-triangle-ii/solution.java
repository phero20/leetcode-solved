class Solution {
    public List<Integer> getRow(int r) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<=r;i++) {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) li.add(1);
                else {
                    int n=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    li.add(n);
                }
            }
            ans.add(li);
        }
        return ans.get(r);
    }
}
