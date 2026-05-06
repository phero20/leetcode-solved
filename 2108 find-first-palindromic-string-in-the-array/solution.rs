impl Solution {
    pub fn first_palindrome(words: Vec<String>) -> String {
        for s in words {
            if Self::isPal(&s) {
                return s
            }
        }
        String::new() 
    }

    pub fn isPal(s: &String) -> bool {
        let bytes = s.as_bytes();
        let mut l = 0;
        let mut r = bytes.len().saturating_sub(1);
        while l < r {
            if bytes[l] != bytes[r] {
                return false;
            }
            l += 1;
            r -= 1;
        }
        true
    }
}
