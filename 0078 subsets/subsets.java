class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        bt(nums,0,new ArrayList<>());
        return ans;
    }

    private void bt(int[] nums,int i,List<Integer> arr) {
        if(i==nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        bt(nums,i+1,arr);
        arr.remove(arr.size()-1);
        bt(nums,i+1,arr);
    }
}