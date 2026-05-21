impl Solution {
    pub fn is_three(n: i32) -> bool {
       let root: i32 = (n as f64).sqrt() as i32;
        if root*root != n {
            return false
        }
        return Self::isPrime(root, 2)
    }

    pub fn isPrime(num: i32, d:i32) -> bool { 
        if num < 2 {
            return false
        }
        if d*d > num {
            return true
        }
        if num%d == 0 {
            return false
        }
        return Self::isPrime(num, d+1)
    }
}
