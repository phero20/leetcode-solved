class Solution {

    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        bt(n,1,k,new ArrayList<>());
        return ans;
    }

    private void bt(int n,int i,int k,List<Integer> arr) {
        if(arr.size()==k) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(i==n+1) return;
        arr.add(i);
        bt(n,i+1,k,arr);
        arr.remove(arr.size()-1);
        bt(n,i+1,k,arr);
    }
}