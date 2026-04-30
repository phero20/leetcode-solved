class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low,mid=0,0
        high = len(nums)-1
        while mid<=high:
            if nums[mid] == 0: 
                nums[mid] = nums[low]
                nums[low] = 0
                low+=1
                mid+=1
            elif nums[mid] == 1: 
                mid+=1
            else: 
                nums[mid] = nums[high]
                nums[high] = 2
                high-=1
