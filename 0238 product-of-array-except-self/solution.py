class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        arr = [1] * (n+1)
        for i in range(n):
            arr[i+1] = arr[i]*nums[i]
        suf = 1
        for i in range(n-1, -1, -1):
            arr[i]=arr[i]*suf
            suf*=nums[i]
        return arr[:n]
