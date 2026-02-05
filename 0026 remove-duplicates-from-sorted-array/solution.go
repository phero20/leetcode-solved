func removeDuplicates(nums []int) int {
    i:=0;
    for index,value:=range nums{
        if value!=nums[i]{
            i++;
            nums[i]=nums[index];
        }
    }
    return i+1;
}
