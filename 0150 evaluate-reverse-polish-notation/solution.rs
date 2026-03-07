impl Solution {
    pub fn eval_rpn(tokens: Vec<String>) -> i32 {
        let mut st: Vec<i32> = Vec::new();

        for token in tokens {
            match token.as_str() {
                "+" => {
                    let a = st.pop().unwrap();
                    let b = st.pop().unwrap();
                    st.push(b + a);
                }
                "-" => {
                    let a = st.pop().unwrap();
                    let b = st.pop().unwrap();
                    st.push(b - a);
                }
                "*" => {
                    let a = st.pop().unwrap();
                    let b = st.pop().unwrap();
                    st.push(b * a);
                }
                "/" => {
                    let a = st.pop().unwrap();
                    let b = st.pop().unwrap();
                    st.push(b / a);
                }
                num => {
                    st.push(num.parse::<i32>().unwrap());
                }
            }
        }

        st.pop().unwrap()
    }
}
