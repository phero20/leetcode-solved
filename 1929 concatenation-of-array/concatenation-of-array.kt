class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val arr = IntArray(nums.size * 2) 
        for(i in nums.indices) {
            arr[i] = nums[i]
            arr[i+nums.size] = nums[i]
        }
        return arr
    }
}