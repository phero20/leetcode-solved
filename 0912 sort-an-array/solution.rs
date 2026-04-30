impl Solution {
    fn merge(nums: &mut Vec<i32>, low: usize, mid: usize, high: usize) {
        let mut temp: Vec<i32> = Vec::with_capacity(high - low + 1);
        let mut i = low;
        let mut j = mid + 1;

        while i <= mid && j <= high {
            if nums[i] <= nums[j] {
                temp.push(nums[i]);
                i += 1;
            } else {
                temp.push(nums[j]);
                j += 1;
            }
        }

        while i <= mid {
            temp.push(nums[i]);
            i += 1;
        }

        while j <= high {
            temp.push(nums[j]);
            j += 1;
        }

        for (k, &val) in temp.iter().enumerate() {
            nums[low + k] = val;
        }
    }

    fn divide(nums: &mut Vec<i32>, low: usize, high: usize) {
        if low >= high {
            return;
        }
        let mid = low + (high - low) / 2;
        Solution::divide(nums, low, mid);
        Solution::divide(nums, mid + 1, high);
        Solution::merge(nums, low, mid, high);
    }

        
    pub fn sort_array(mut nums: Vec<i32>) -> Vec<i32> {
        if !nums.is_empty() {
            let n = nums.len();
            Solution::divide(&mut nums, 0, n - 1);
        }
        nums   
    }
}
