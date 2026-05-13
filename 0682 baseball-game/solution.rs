impl Solution {
    pub fn cal_points(operations: Vec<String>) -> i32 {
        let mut stack: Vec<i32> = Vec::new();
        let mut ans = 0;

        for s in operations {
            match s.as_str() {
                "+" => {
                    let sum = stack[stack.len()-1] + stack[stack.len()-2];
                    stack.push(sum);
                    ans += sum;
                },
                "D" => {
                    let mul = 2 * stack.last().unwrap();
                    stack.push(mul);
                    ans += mul;
                },
                "C" => {
                    ans -= stack.last().unwrap();
                    stack.pop();
                },
                _ => {
                    let num: i32 = s.parse().unwrap();
                    stack.push(num);
                    ans += num;
                }
            }
        }
        ans
    }
}

