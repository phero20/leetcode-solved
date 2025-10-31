class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> nset = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
           Boolean tr =  nset.add(nums[i]);
            if(!tr){
                result.add(nums[i]);
            }
        }
        return new ArrayList<>(result);
    }
}
