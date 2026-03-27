class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = nums.clone();
        Arrays.sort(ans);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<ans.length;i++) {
            if(!map.containsKey(ans[i])) {
                map.put(ans[i],i);
            }
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
