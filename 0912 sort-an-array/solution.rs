use rand::Rng;
impl Solution {
    fn partition(nums: &mut Vec<i32>, low: usize, high: usize) -> usize {
        let mut rng = rand::thread_rng();
        let pivot_index = rng.gen_range(low..=high);
        nums.swap(pivot_index, high); 
        let pivot = nums[high];
        let mut i = low;
        for j in low..high {
            if nums[j] < pivot {
                nums.swap(i, j);
                i += 1;
            }
        }
        nums.swap(i, high);
        i
    }
    fn quick_sort(nums: &mut Vec<i32>, low: usize, high: usize) {
        if low < high {
            let p = Solution::partition(nums, low, high);
            if p > 0 {
                Solution::quick_sort(nums, low, p - 1);
            }
            Solution::quick_sort(nums, p + 1, high);
        }
    }
    pub fn sort_array(mut nums: Vec<i32>) -> Vec<i32> {
        if !nums.is_empty() {
            let n = nums.len();
            Solution::quick_sort(&mut nums, 0, n - 1);
        }
        nums
    }
}
