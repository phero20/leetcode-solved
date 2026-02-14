class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int k = 0; k < nums.length-3; k++) {
            if (k>0 && nums[k]==nums[k-1]) continue;
            for(int i=k+1;i<nums.length-2;i++) {
                if(i>k+1 && nums[i]==nums[i-1]) continue;
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    long sum = (long)nums[i] + nums[l] + nums[r]+nums[k];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[k],nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1])
                            l++;
                        while (l < r && nums[r] == nums[r - 1])
                            r--;
                        l++;
                        r--;
                    } else if (sum < target)
                        l++;
                    else
                        r--;
                }
            }
        }

        return ans;
    }
}
