class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        boolean arr[] = new boolean[nums.length+1];
        for (int i : nums)
            arr[i] = true;
        for (int i = 1; i < arr.length; i++)
            if (!arr[i])
                l.add(i);

        return l;
    }
}
