impl Solution {
    pub fn number_of_steps(num: i32) -> i32 {
        return Self::c(num,0)
    }
    pub fn c(num: i32,ct: i32) -> i32  {
        if( num ==0 ) {
            return ct
        }
        if(num%2==0) {
            return Self::c(num/2,ct+1)
        } else {
             return Self::c(num-1,ct+1)
        }
    }
}
