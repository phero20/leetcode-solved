class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        l=len(nums)
        cal=(l*(l+1))/2
        sum=0
        for i in nums:
            sum+=i
        return int(cal-sum)
