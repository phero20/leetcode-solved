class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] m={0};
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],0);
        }
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }
        map.forEach((key,value)->{
            if(value>nums.length/2){
                m[0]=key;
            };
        });
        return m[0];
    }
}
