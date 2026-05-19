impl Solution {
    fn validate_stack_sequences(pushed: Vec<i32>, popped: Vec<i32>) -> bool {
        let mut stack: Vec<i32> = Vec::new();
        let mut j = 0;

        for x in pushed {
            stack.push(x);
            while !stack.is_empty() && j < popped.len() && stack.last() == Some(&popped[j]) {
                stack.pop();
                j += 1;
            }
        }

        stack.is_empty() && j == popped.len()
    }

}
