class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        ans = 0
        for val in num_set:
            if val - 1 not in num_set:
                curr=val
                len=1
                while curr+1 in num_set:
                    curr+=1
                    len+=1
                ans = max(ans,len)
        return ans
