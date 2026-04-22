impl Solution {
    pub fn find_missing_and_repeated_values(grid: Vec<Vec<i32>>) -> Vec<i32> {
        let n = grid.len();
        let m = n * n;
        let mut set = vec![false; m];
        let mut repeated = 0;
        
        for i in 0..n {
            for j in 0..n {
                let val = grid[i][j] as usize;
                if set[val - 1] {
                    repeated = val as i32;
                }
                set[val - 1] = true;
            }
        }
        
        let mut missing = 0;
        for i in 1..=m {
            if !set[i - 1] {
                missing = i as i32;
                break;
            }
        }
        
        vec![repeated, missing]
    }
}
