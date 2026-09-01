class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
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
        int nxt = i+1;
        while(nxt < nums.length && nums[nxt]==nums[i]) nxt++;
        bt(nums,nxt,arr);
    }
}