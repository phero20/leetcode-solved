impl Solution {
    pub fn asteroid_collision(ar: Vec<i32>) -> Vec<i32> {
        let mut st: Vec<i32> = Vec::new();
        for &val in ar.iter() {
            let mut a = true;
            while !st.is_empty() && *st.last().unwrap() > 0 && val < 0 {
                let top = *st.last().unwrap();
                if top < -val {
                    st.pop();
                    continue;
                } else if top == -val {
                    st.pop();
                    a=false;
                } else {
                    a=false;
                }
                break;
            }
            if a {
                st.push(val);
            }
        }
        st
    }
}
