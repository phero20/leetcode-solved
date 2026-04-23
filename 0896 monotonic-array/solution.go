func isMonotonic(nums []int) bool {
    isd,isi:=true,true;
    for i:=1;i<len(nums);i++ {
        if nums[i] > nums[i-1] {
            isd = false
        }
        if nums[i] < nums[i-1] {
            isi = false
        }
    }
    return isi || isd
}
