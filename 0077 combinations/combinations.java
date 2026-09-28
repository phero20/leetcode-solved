class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        bt(n,1,k,new ArrayList<>());
        return ans;
    }

    private void bt(int n,int i,int k,List<Integer> arr) {
        if(arr.size() == k) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int j=i;j<=n;j++) {
            arr.add(j);
            bt(n,j+1,k,arr);
            arr.remove(arr.size()-1);
        } 
    }
}