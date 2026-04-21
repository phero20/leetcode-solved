use std::collections::HashMap;
impl Solution {
    pub fn next_greater_element(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        let mut st = Vec::new();
        let mut map = HashMap::new();
        for i in nums2 {
           while !st.is_empty() && *st.last().unwrap() < i {
                map.insert(st.pop().unwrap(), i);
            }
            st.push(i);
        }
       let mut ans = Vec::new();
       for i in nums1 {
            ans.push(*map.get(&i).unwrap_or(&-1));
        }
        ans
    }
}
