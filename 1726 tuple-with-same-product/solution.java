class Solution {
    public int tupleSameProduct(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int v = nums[i]*nums[j];
                map.merge(v,1,Integer::sum);
            }
        }
        int res =0;
        for(int i:map.values())
            if(i>0)
                res+=(i*(i-1)/2) *8;
        return res;
    }
}
