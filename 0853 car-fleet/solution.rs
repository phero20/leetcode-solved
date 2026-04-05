impl Solution {
    pub fn car_fleet(target: i32, position: Vec<i32>, speed: Vec<i32>) -> i32 {
        let n = position.len();
        if n == 0 { return 0; }
        let mut mat: Vec<Vec<f64>> = Vec::new();
        for i in 0..n {
            let time = (target - position[i]) as f64 / speed[i] as f64;
            mat.push(vec![position[i] as f64, time]);
        }
        mat.sort_by(|a, b| b[0].partial_cmp(&a[0]).unwrap());
        let mut fleet = 0;
        let mut maxTime = 0.0;
        for i in 0..n {
            let current_time = mat[i][1];
            if current_time > maxTime {
                fleet+=1;
                maxTime = current_time;
            }
        }
        fleet
    }
}
