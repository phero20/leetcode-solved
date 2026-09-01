class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();
        bt(candidates,0,target,new ArrayList<>());
        return ans;
    }

    private void bt(int[] nums,int i,int target,List<Integer> arr) {
        if(target==0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(target < 0 || i==nums.length) return;

        arr.add(nums[i]);
        bt(nums,i+1,target-nums[i],arr);
        arr.remove(arr.size()-1);

        int nxt = i;
        while(nxt < nums.length && nums[nxt]==nums[i]) nxt++;
        bt(nums,nxt,target,arr);
    }
}