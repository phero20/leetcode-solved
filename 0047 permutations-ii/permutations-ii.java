class Solution {

    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        bt(nums,0,new ArrayList<>(),new boolean[nums.length+1]);
        return ans;
    }

    private void bt(int[] nums,int i,List<Integer> arr,boolean[] u) {
        if(arr.size()==nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(i==nums.length) return;

        if(!u[i]) {
            if(i > 0 && nums[i]==nums[i-1] && !u[i-1]) {

            } else {
                arr.add(nums[i]);
                u[i] = true;
                bt(nums,0,arr,u);
                arr.remove(arr.size()-1);
                u[i] = false;
            }
        }
        bt(nums,i+1,arr,u);
    }
}