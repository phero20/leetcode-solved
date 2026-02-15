impl Solution {
    pub fn two_sum(numbers: Vec<i32>, target: i32) -> Vec<i32> {
        let mut i=0;
        let mut j=numbers.len()-1;
        while(i<j) {
            let sum = numbers[i]+numbers[j];
            if(sum==target) {
                return vec![(i+1) as i32,(j+1) as i32];
            } else if(sum<target) {
                i+=1;
            } else {
                j-=1;
            }
        }
        return vec![];
    }
}
