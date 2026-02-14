func nextPermutation(nums []int)  {
    n:=len(nums)
    i:=n-2
    for i>=0 && nums[i]>=nums[i+1] {
        i--
    }
    if i>=0 {
        j:=n-1
        for nums[j]<=nums[i] {
            j--
        }
        nums[i],nums[j]=nums[j],nums[i]
    }
    rev(nums[i+1:])
}

func rev(nums []int) {
    i,j:=0,len(nums)-1
    for i<j {
        nums[i],nums[j]=nums[j],nums[i]
        i++
        j--
    }
}

