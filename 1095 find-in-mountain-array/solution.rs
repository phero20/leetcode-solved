/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 *  struct MountainArray;
 *  impl MountainArray {
 *     fn get(index:i32)->i32;
 *     fn length()->i32;
 * };
 */

impl Solution {
    pub fn find_in_mountain_array(target: i32, mo: &MountainArray) -> i32 {
        let mut low = 0;
        let mut high =  mo.length() - 1;
        while low<high {
            let mid = low+(high-low)/2;
            if mo.get(mid) < mo.get(mid + 1) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        let peak = low;
        let ans = Self::bin(mo, target, 0, peak, true);
        if ans != -1 {
            return ans;
        }
       Self::bin(mo, target, peak + 1, mo.length() - 1, false)
    }
    fn bin(mo: &MountainArray, target: i32, mut low: i32, mut high: i32, asc: bool) -> i32 {
        while low <= high {
            let mid = low+(high-low)/2;
            let val = mo.get(mid);
            if val == target {
                return mid;
            }
            if asc {
                if val < target {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if val < target {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        -1
    }
}
