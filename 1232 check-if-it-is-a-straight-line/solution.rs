impl Solution {
    pub fn check_straight_line(coordinates: Vec<Vec<i32>>) -> bool {
        let x0 = coordinates[0][0];
        let y0 = coordinates[0][1];
        let x1 = coordinates[1][0];
        let y1 = coordinates[1][1];
        let dx = x1-x0;
        let dy = y1-y0;
        for i in 2..coordinates.len() {
            let xi = coordinates[i][0];
            let yi = coordinates[i][1];
            if (yi - y0) * dx != (xi - x0) * dy {
                return false
            }
        }
        return true
    }
}
