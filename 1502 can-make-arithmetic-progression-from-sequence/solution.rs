impl Solution {
    pub fn can_make_arithmetic_progression(mut arr: Vec<i32>) -> bool {
        if arr.len() <=2 {
            return true
        }
        arr.sort();
        let gap =arr[1]-arr[0];
        for i in 2..arr.len() {
            if arr[i]-arr[i-1]!=gap {
                return false
            }
        }
        true
    }
}
