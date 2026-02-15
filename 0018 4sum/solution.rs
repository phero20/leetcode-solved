impl Solution {
    pub fn four_sum(mut nums: Vec<i32>, target: i32) -> Vec<Vec<i32>> {
        if nums.len()<4 {
            return Vec::new();
        }
        let mut ans:Vec<Vec<i32>> = Vec::new();
        nums.sort();
        for i in 0..nums.len()-3 {
            if i>0 && nums[i]==nums[i-1] {
                continue;
            }
            for j in i+1..nums.len()-2 {
                if j>i+1 && nums[j]==nums[j-1] {
                    continue;
                }
                let mut l:usize = j+1;
                let mut r:usize = nums.len()-1;
                while l<r {
                    let sum = nums[i] as i64 +nums[j] as i64 +nums[l] as i64 +nums[r] as i64;
                    if sum==target as i64 {

                        ans.push(vec![nums[i],nums[j],nums[l],nums[r]]);

                        while l<r && nums[l]==nums[l+1] {
                            l+=1;
                        }
                        while l<r && nums[r]==nums[r-1] {
                            r-=1;
                        }
                        l+=1;
                        r-=1;
                    } else if sum<target as i64 {
                        l+=1;
                    } else {
                        r-=1;
                    }
                }
            }
           
        }
         ans
    }
}
