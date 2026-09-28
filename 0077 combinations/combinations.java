class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(n,1,k,new ArrayList<>(),ans);
        return ans;
    }

    private void bt(int n,int i,int k,List<Integer> arr,List<List<Integer>> ans) {
        if(arr.size() == k) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int j=i;j<=n;j++) {
            arr.add(j);
            bt(n,j+1,k,arr,ans);
            arr.remove(arr.size()-1);
        } 
    }
}