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
        for(int j=i;j<nums.length;j++) {
            if(j>i && nums[j]==nums[j-1]) continue;
            if(nums[j] > target) break;
            arr.add(nums[j]);
            bt(nums,j+1,target-nums[j],arr);
            arr.remove(arr.size()-1);
        }
    }
}