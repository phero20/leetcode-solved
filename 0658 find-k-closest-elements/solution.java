class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int l=0,r=nums.length-1;
        while(r-l+1>k) {
            if(Math.abs(nums[l]-x)>Math.abs(nums[r]-x)) l++;
            else r--;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=l;i<=r;i++) ans.add(nums[i]);
        return ans;
    }
}
