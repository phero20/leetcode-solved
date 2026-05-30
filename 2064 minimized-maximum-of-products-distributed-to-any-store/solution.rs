impl Solution {
    pub fn minimized_maximum(n: i32, quantities: Vec<i32>) -> i32 {
    let mut left = 1;
    let mut right = *quantities.iter().max().unwrap();

    while left < right {
        let mid = (left + right) / 2;
        if Self::can_distribute(n, &quantities, mid) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    left
}

fn can_distribute(n: i32, quantities: &Vec<i32>, x: i32) -> bool {
    let mut stores = 0;
    for &q in quantities {
        stores += (q + x - 1) / x; 
        if stores > n {
            return false;
        }
    }
    true
    }
}
