func rotate(nums []int, k int)  {
    k=k%len(nums)
    rev(nums,0,len(nums)-1)
    rev(nums,0,k-1)
    rev(nums,k,len(nums)-1)
}

func rev(nums []int,i int,j int) {
    for i<j {
        nums[i],nums[j]=nums[j],nums[i]
        i++
        j--
    }
}
