class Solution {

    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        bt(nums,0,new ArrayList<>(),new boolean[nums.length+1]);
        return ans;
    }

    private void bt(int[] nums,int i,List<Integer> arr,boolean[] u) {
        if(arr.size()==nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int j=0;j<nums.length;j++) {
            if(u[j]) continue;
            arr.add(nums[j]);
            u[j] = true;
            bt(nums,j,arr,u);
            arr.remove(arr.size()-1);
            u[j] = false;
        }
    }
}