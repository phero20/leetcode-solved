impl Solution {
    pub fn count_students(students: Vec<i32>, sandwiches: Vec<i32>) -> i32 {
        let mut z =0;
        let mut o =0;
        for i in students {
            if i==0 {
                z+=1;
            } else {
                o+=1;
            }
        }
        for s in sandwiches {
            if s==0 {
                if z==0 {
                    return o
                }
                z-=1;
            } else {
                if o==0 {
                    return z
                }
                o-=1;
            }
        }
        0
    }
}
