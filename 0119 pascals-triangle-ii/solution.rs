impl Solution {
    pub fn get_row(row_index: i32) -> Vec<i32> {
    let mut row = Vec::with_capacity((row_index + 1) as usize);
    row.push(1);
    for k in 1..=row_index {
        let prev = row[(k - 1) as usize] as i64;
        let val = prev * (row_index - k + 1) as i64 / k as i64;
        row.push(val as i32);
    }
    row
    }
}
