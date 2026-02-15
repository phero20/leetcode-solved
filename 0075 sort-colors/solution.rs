impl Solution {
    pub fn sort_colors(nums: &mut Vec<i32>) {
        let mut low:usize = 0;
        let mut mid:usize = 0;
        let mut high:usize = nums.len()-1;

        while mid<=high {
            if nums[mid]==0 {
                nums.swap(mid,low);
                mid+=1;
                low+=1;
            } else if nums[mid] == 1 {
                mid+=1;
            } else {
                nums.swap(mid,high);
                if high==0 {
                    break;
                }
                high-=1;
            }
        }
    }
}
