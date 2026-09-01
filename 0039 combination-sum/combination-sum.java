class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
        bt(nums,i,target-nums[i],arr);
        arr.remove(arr.size()-1);
        bt(nums,i+1,target,arr);
    }
}