class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx=0;
        for(int i=1;i<=n && idx<target.length;i++) {
            ans.add("Push");
            if(target[idx]==i){
                idx++;
            }
            else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}
