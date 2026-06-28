class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for(i in nums) {
            if(!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}