func moveZeroes(nums []int)  {
    i:=0
    for j,v:=range nums {
        if v!=0 {
            nums[i],nums[j]=nums[j],nums[i];
            i++
        }
    }
}
