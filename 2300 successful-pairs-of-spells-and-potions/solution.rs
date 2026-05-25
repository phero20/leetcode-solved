impl Solution {
    pub fn successful_pairs(spells: Vec<i32>,mut potions: Vec<i32>, success: i64) -> Vec<i32> {
        potions.sort();
    let m = potions.len();
    let mut ans = Vec::with_capacity(spells.len());

    for spell in spells {
        let mut l = 0;
        let mut r = m;
        while l < r {
            let mid = l + (r - l) / 2;
            let v = (potions[mid] as i64) * (spell as i64);
            if v < success {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        ans.push((m - l) as i32);
    }
    ans
    }
}
