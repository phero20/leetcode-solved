impl Solution {
    pub fn is_valid(s: String) -> bool {
        let mut stack: Vec<char> = Vec::new();
        for c in s.chars() {
            match c {
                '(' | '[' | '{' => stack.push(c),
                ')' | ']' | '}' => {
                    if let Some(top) = stack.pop() {
                        if (c == ')' && top != '(') ||
                           (c == ']' && top != '[') ||
                           (c == '}' && top != '{') {
                            return false;
                        }
                    } else {
                        return false; 
                    }
                }
                _ => {} 
            }
        }

        stack.is_empty()
    }
}
