class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        bt(nums,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }

    private void bt(int[] nums,List<Integer> arr,boolean[] set) {
        if(arr.size() == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int j=0;j<nums.length;j++) {
            if(set[j]) continue;
            if(j > 0 && nums[j] == nums[j-1] && !set[j-1]) {
                continue;
            }
            arr.add(nums[j]);
            set[j] = true;
            bt(nums,arr,set);
            arr.remove(arr.size()-1);
            set[j] = false;
        }
    }
}