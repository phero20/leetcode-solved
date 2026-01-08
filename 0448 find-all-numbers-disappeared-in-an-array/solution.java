class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[nums.length+1];
       for(int num:nums) arr[num]=true;
        for(int i=1;i<=nums.length;i++){
            if(!arr[i]) list.add(i);
        }
        return list;
    }
}
