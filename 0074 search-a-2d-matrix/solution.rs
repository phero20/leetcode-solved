impl Solution {
    pub fn search_matrix(matrix: Vec<Vec<i32>>, target: i32) -> bool {
        let n = matrix.len() as i32;       
        let m = matrix[0].len() as i32;    
        let mut l: i32 = 0;
        let mut r: i32 = n * m - 1;
        while l <= r {
            let mid = l + (r - l) / 2;
            let row = (mid / m) as usize;
            let col = (mid % m) as usize;
            let val = matrix[row][col];
            if val == target {
                return true;
            } else if val < target {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        false
    }
}
