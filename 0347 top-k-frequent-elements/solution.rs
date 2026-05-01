use std::collections::HashMap;

impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut fr: HashMap<i32, i32> = HashMap::new();
        for i in nums {
            *fr.entry(i).or_insert(0) += 1;
        }

        let max_freq = *fr.values().max().unwrap();

        let mut buc: Vec<Vec<i32>> = vec![Vec::new(); (max_freq + 1) as usize];
        for (num, f) in fr {
            buc[f as usize].push(num);
        }

        let mut ans: Vec<i32> = Vec::new();
        for freq in (0..buc.len()).rev() {
            for &num in &buc[freq] {
                if ans.len() < k as usize {
                    ans.push(num);
                } else {
                    break;
                }
            }
            if ans.len() == k as usize {
                break;
            }
        }

        ans
    }
}

